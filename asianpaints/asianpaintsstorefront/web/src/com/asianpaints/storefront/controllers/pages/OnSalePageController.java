/**
 *
 */
package com.asianpaints.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.asianpaints.core.onsale.facade.AsianpaintsOnSaleProductFacade;


/**
 * @author Dell
 *
 */
@Controller
public class OnSalePageController extends AbstractPageController
{
	protected static final String ONSALE_CMS_PAGE = "onSale";

	@Resource(name = "defaultAsianpaintsOnSaleProductFacade")
	AsianpaintsOnSaleProductFacade asianpaintsOnSaleProductFacade;

	@Resource(name = "accountBreadcrumbBuilder")
	ResourceBreadcrumbBuilder accountBreadcrumbBuilder;

	@RequestMapping(value = "/onSaleProducts", method = RequestMethod.GET)
	public String onSaleProducts(final Model model) throws CMSItemNotFoundException
	{
		final List<ProductModel> productModel = asianpaintsOnSaleProductFacade.isOnSaleProducts();
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
		model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.onsale.products"));
		model.addAttribute("metaRobots", "no-index,no-follow");
		model.addAttribute("onSaleProductData", productModel);
		return getViewForPage(model);
	}
}
