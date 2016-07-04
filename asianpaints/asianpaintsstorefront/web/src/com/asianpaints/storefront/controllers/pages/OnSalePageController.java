/**
 *
 */
package com.asianpaints.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author Dell
 *
 */
@Controller
public class OnSalePageController extends AbstractPageController
{
	protected static final String ONSALE_CMS_PAGE = "onSale";

	@RequestMapping(value = "/onSaleProducts", method = RequestMethod.GET)
	public String onSaleProducts(final Model model) throws CMSItemNotFoundException
	{
		try
		{
			storeCmsPageInModel(model, getContentPageForLabelOrId(ONSALE_CMS_PAGE));
		}
		catch (final CMSItemNotFoundException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			setUpMetaDataForContentPage(model, getContentPageForLabelOrId(ONSALE_CMS_PAGE));
		}
		catch (final CMSItemNotFoundException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
		return "onSaleLayout";
	}
}
