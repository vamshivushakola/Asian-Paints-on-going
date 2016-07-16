/**
 *
 */
package com.asianpaints.facades.populators;

import de.hybris.platform.commercefacades.order.converters.populator.OrderEntryPopulator;
import de.hybris.platform.commercefacades.order.data.OrderEntryData;
import de.hybris.platform.commercefacades.product.data.PriceData;
import de.hybris.platform.commercefacades.product.data.PriceDataType;
import de.hybris.platform.commerceservices.price.CommercePriceService;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.europe1.model.PriceRowModel;
import de.hybris.platform.jalo.order.price.PriceInformation;

import java.math.BigDecimal;
import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.asianpaints.core.enums.PriceType;


/**
 * @author vvushako
 *
 */
public class AsianpaintsOrderEntryPopulator extends OrderEntryPopulator
{
	private static final Logger LOG = Logger.getLogger(AsianpaintsOrderEntryPopulator.class);

	@Autowired
	private CommercePriceService commercePriceService;


	@Override
	public void populate(final AbstractOrderEntryModel source, final OrderEntryData target)
	{
		//
		super.populate(source, target);
		if (source.getSelectedAddons() != null)
		{
			target.setAddonsOrderEntry(source.getSelectedAddons());

			//	target.setAddonsOrderEntry(((CartEntryModel) source).getCartAddons());
		}

	}

	@Override
	protected void addTotals(final AbstractOrderEntryModel orderEntry, final OrderEntryData entry)
	{
		super.addTotals(orderEntry, entry);
		final ProductModel productModel = orderEntry.getProduct();
		final PriceInformation info;


		if (CollectionUtils.isEmpty(productModel.getVariants()))
		{
			//priceType = PriceDataType.BUY;
			info = getCommercePriceService().getWebPriceForProduct(productModel);
		}
		else
		{
			//priceType = PriceDataType.FROM;
			info = getCommercePriceService().getFromPriceForProduct(productModel);
		}
		if (info != null)
		{
			PriceData salePrice = null;
			final Collection<PriceRowModel> productPriceRows = productModel.getEurope1Prices();
			if (productModel.getIsOnSale() != null && productModel.getIsOnSale().booleanValue())
			{
				for (final PriceRowModel priceRow : productPriceRows)
				{
					if (priceRow.getPriceType() != null && priceRow.getPriceType().equals(PriceType.SALEPRICE))
					{
						salePrice = createPrice(orderEntry, BigDecimal.valueOf(priceRow.getPrice().doubleValue()));
						entry.setBasePrice(salePrice);
					}
					else
					{
						salePrice = createPrice(orderEntry, BigDecimal.valueOf(priceRow.getPrice().doubleValue()));
						entry.setActualBasePrice(salePrice);

					}
				}
			}
			else
			{
				for (final PriceRowModel priceRow : productPriceRows)
				{
					salePrice = createPrice(orderEntry, BigDecimal.valueOf(priceRow.getPrice().doubleValue()));
					entry.setBasePrice(salePrice);
				}
			}
		}
	}

	protected PriceData createPrice(final AbstractOrderEntryModel orderEntry, final BigDecimal val)
	{
		if (orderEntry != null && orderEntry.getOrder() != null)
		{
			return getPriceDataFactory().create(PriceDataType.BUY, BigDecimal.valueOf(val.doubleValue()),
					orderEntry.getOrder().getCurrency());
		}
		else
		{
			return getPriceDataFactory().create(PriceDataType.BUY, BigDecimal.valueOf(val.doubleValue()), "USD");
		}
	}

	public CommercePriceService getCommercePriceService()
	{
		return commercePriceService;
	}

	public void setCommercePriceService(final CommercePriceService commercePriceService)
	{
		this.commercePriceService = commercePriceService;
	}


}
