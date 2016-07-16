/**
 *
 */
package com.asianpaints.core.onsale.service.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import com.asianpaints.core.onsale.dao.AsianpaintsOnSaleProductDao;
import com.asianpaints.core.onsale.service.AsianpaintsOnSaleProductService;


/**
 * @author Dell
 *
 */
public class DefaultAsianpaintsOnSaleProductService implements AsianpaintsOnSaleProductService
{
	AsianpaintsOnSaleProductDao asianpaintsOnSaleProductDao;
	private ModelService modelService;

	public AsianpaintsOnSaleProductDao getAsianpaintsOnSaleProductDao()
	{
		return asianpaintsOnSaleProductDao;
	}

	public void setAsianpaintsOnSaleProductDao(final AsianpaintsOnSaleProductDao asianpaintsOnSaleProductDao)
	{
		this.asianpaintsOnSaleProductDao = asianpaintsOnSaleProductDao;
	}

	public ModelService getModelService()
	{
		return modelService;
	}

	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}


	@Override
	public List<ProductModel> isOnSaleProducts()
	{
		final List<ProductModel> productModel = asianpaintsOnSaleProductDao.isOnSaleProducts();
		return productModel;
	}

}
