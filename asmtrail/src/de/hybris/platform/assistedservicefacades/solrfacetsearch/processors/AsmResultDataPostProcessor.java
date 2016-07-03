/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.assistedservicefacades.solrfacetsearch.processors;

import de.hybris.platform.assistedservicefacades.AssistedServiceFacade;
import de.hybris.platform.category.CategoryService;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.search.FacetSearchException;
import de.hybris.platform.solrfacetsearch.search.SearchResult;
import de.hybris.platform.solrfacetsearch.search.SolrResultPostProcessor;
import de.hybris.platform.solrfacetsearch.search.impl.SolrSearchResult;

import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.apache.solr.common.SolrDocumentList;


public class AsmResultDataPostProcessor implements SolrResultPostProcessor
{
	private static final Logger LOG = Logger.getLogger(AsmResultDataPostProcessor.class);
	private CategoryService categoryService;
	private AssistedServiceFacade assistedServiceFacade;

	@Override
	public SearchResult process(final SearchResult solrSearchResult)
	{
		// do not filter out ASM category products if AS agent is logged in
		if (getAssistedServiceFacade().isAssistedServiceAgentLoggedIn())
		{
			return solrSearchResult;
		}

		//make sure we have results to filter
		if (solrSearchResult != null && solrSearchResult.getTotalNumberOfResults() > 0)
		{
			try
			{
				final List<? extends ItemModel> results = solrSearchResult.getResults();

				final SolrDocumentList queryResponseResults = ((SolrSearchResult) solrSearchResult).getQueryResponse().getResults();

				CategoryModel asmCategory = null;

				final SolrDocumentList removedList = new SolrDocumentList();
				for (int i = 0; i < results.size(); i++)
				{
					final ItemModel item = results.get(i);
					if (item instanceof ProductModel)
					{

						final ProductModel productModel = (ProductModel) item;

						//here we are getting the ASM Category which has the Id of 1500
						if (asmCategory == null)
						{
							asmCategory = getCategoryService().getCategoryForCode(productModel.getCatalogVersion(), "1500");
						}

						//get categories for the current product
						final Collection<CategoryModel> categories = productModel.getSupercategories();

						//check to see if the ASM Category is part of the associated categories or no
						if (CollectionUtils.isNotEmpty(categories))
						{
							if (categories.contains(asmCategory) && queryResponseResults.get(i).containsValue(productModel.getCode()))
							{
								removedList.add(queryResponseResults.get(i)); //add the search item to be removed
							}
						}

					}
				}
				queryResponseResults.removeAll(removedList); //remove matching products that should only be displayed to ASM agent
			}
			catch (final FacetSearchException e)
			{
				LOG.error(e.getMessage(), e);
				return solrSearchResult;
			}
		}
		return solrSearchResult;
	}

	protected CategoryService getCategoryService()
	{
		return categoryService;
	}

	public void setCategoryService(final CategoryService categoryService)
	{
		this.categoryService = categoryService;
	}

	protected AssistedServiceFacade getAssistedServiceFacade()
	{
		return assistedServiceFacade;
	}

	public void setAssistedServiceFacade(final AssistedServiceFacade assistedServiceFacade)
	{
		this.assistedServiceFacade = assistedServiceFacade;
	}

}
