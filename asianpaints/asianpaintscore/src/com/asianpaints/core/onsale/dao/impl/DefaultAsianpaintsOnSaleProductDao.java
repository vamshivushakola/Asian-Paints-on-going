/**
 *
 */
package com.asianpaints.core.onsale.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.annotation.Resource;

import com.asianpaints.core.onsale.dao.AsianpaintsOnSaleProductDao;


/**
 * @author Dell
 *
 */
public class DefaultAsianpaintsOnSaleProductDao implements AsianpaintsOnSaleProductDao
{
	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Override
	public List<ProductModel> isOnSaleProducts()
	{
		final String query = "Select {pk} from {AsianpaintsProduct} where {isOnSale} = true";
		final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
		final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);

		return searchResult.getResult();

	}



}
