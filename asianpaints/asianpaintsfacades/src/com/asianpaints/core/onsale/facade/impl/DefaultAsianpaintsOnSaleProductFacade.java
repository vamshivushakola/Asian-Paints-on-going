/**
 *
 */
package com.asianpaints.core.onsale.facade.impl;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import com.asianpaints.core.onsale.facade.AsianpaintsOnSaleProductFacade;
import com.asianpaints.core.onsale.service.AsianpaintsOnSaleProductService;


/**
 * @author Dell
 *
 */
public class DefaultAsianpaintsOnSaleProductFacade implements AsianpaintsOnSaleProductFacade
{
	AsianpaintsOnSaleProductService asianpaintsOnSaleProductService;

	/**
	 * @return the asianpaintsOnSaleProductService
	 */
	public AsianpaintsOnSaleProductService getAsianpaintsOnSaleProductService()
	{
		return asianpaintsOnSaleProductService;
	}

	/**
	 * @param asianpaintsOnSaleProductService
	 *           the asianpaintsOnSaleProductService to set
	 */
	public void setAsianpaintsOnSaleProductService(final AsianpaintsOnSaleProductService asianpaintsOnSaleProductService)
	{
		this.asianpaintsOnSaleProductService = asianpaintsOnSaleProductService;
	}

	@Override
	public List<ProductModel> isOnSaleProducts()
	{
		final List<ProductModel> productModel = getAsianpaintsOnSaleProductService().isOnSaleProducts();
		return productModel;
	}
}
