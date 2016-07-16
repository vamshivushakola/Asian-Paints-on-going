/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.product.PriceDataFactory;
import de.hybris.platform.commercefacades.product.converters.populator.AbstractProductPopulator;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.price.CommercePriceService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.jalo.order.price.PriceInformation;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.math.BigDecimal;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import com.asianpaints.core.enums.PriceType;


/**
 * @author Dell
 *
 */
public class AsianpaintsProductPricePopulator<SOURCE extends ProductModel, TARGET extends ProductData>
		extends AbstractProductPopulator<SOURCE, TARGET>
{
	private static final Logger LOG = Logger.getLogger(AsianpaintsProductPricePopulator.class);

	private CommercePriceService commercePriceService;

	private PriceDataFactory priceDataFactory;

	/**
	 * @return the priceDataFactory
	 */
	public PriceDataFactory getPriceDataFactory()
	{
		return priceDataFactory;
	}

	/**
	 * @param priceDataFactory
	 *           the priceDataFactory to set
	 */
	public void setPriceDataFactory(final PriceDataFactory priceDataFactory)
	{
		this.priceDataFactory = priceDataFactory;
	}

	/**
	 * @return the commercePriceService
	 */
	public CommercePriceService getCommercePriceService()
	{
		return commercePriceService;
	}

	/**
	 * @param commercePriceService
	 *           the commercePriceService to set
	 */
	public void setCommercePriceService(final CommercePriceService commercePriceService)
	{
		this.commercePriceService = commercePriceService;
	}

	@Override
	public void populate(final SOURCE productModel, final TARGET productData) throws ConversionException
	{
		final PriceDataType priceType;
		final PriceInformation info;
		if (CollectionUtils.isEmpty(productModel.getVariants()))
		{
			priceType = PriceDataType.BUY;
			info = getCommercePriceService().getWebPriceForProduct(productModel);
		}
		else
		{
			priceType = PriceDataType.FROM;
			info = getCommercePriceService().getFromPriceForProduct(productModel);
		}

		if (info != null)
		{
			PriceData priceData = null;
			final Collection<PriceRowModel> productPriceRows = productModel.getEurope1Prices();
			if (productModel.getIsOnSale() != null && productModel.getIsOnSale().booleanValue())
			{
				for (final PriceRowModel priceRow : productPriceRows)
				{
					if (priceRow.getPriceType() != null && priceRow.getPriceType().equals(PriceType.SALEPRICE))
					{
						priceData = getPriceDataFactory().create(priceType, BigDecimal.valueOf(priceRow.getPrice().doubleValue()),
								priceRow.getCurrency().getIsocode());
						productData.setPrice(priceData);

					}
					else
					{
						priceData = getPriceDataFactory().create(priceType, BigDecimal.valueOf(priceRow.getPrice().doubleValue()),
								priceRow.getCurrency().getIsocode());
						productData.setActualPrice(priceData);
						//productData.setPrice(priceData);
					}
				}
			}
			else
			{
				for (final PriceRowModel priceRow : productPriceRows)
				{
					priceData = getPriceDataFactory().create(priceType, BigDecimal.valueOf(priceRow.getPrice().doubleValue()),
							priceRow.getCurrency().getIsocode());
					productData.setPrice(priceData);
				}
			}
		}
	}
}
