/*
 *
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 */
package de.hybris.platform.assistedservicestorefront.jalo;

import de.hybris.platform.assistedservicefacades.AssistedServiceFacade;
import de.hybris.platform.core.Registry;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.promotions.jalo.AbstractPromotionRestriction;

import java.util.Collection;
import java.util.Date;

import org.apache.log4j.Logger;


public class PromotionAssistedServiceRestriction extends GeneratedPromotionAssistedServiceRestriction
{
	@SuppressWarnings("unused")
	private final static Logger LOG = Logger.getLogger(PromotionAssistedServiceRestriction.class.getName());
	private AssistedServiceFacade assistedServiceFacade;


	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes)
			throws JaloBusinessException
	{
		// business code placed here will be executed before the item is created
		// then create the item
		final Item item = super.createItem(ctx, type, allAttributes);
		// business code placed here will be executed after the item was created
		// and return the item
		return item;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.promotions.jalo.AbstractPromotionRestriction#evaluate(de.hybris.platform.jalo.SessionContext,
	 * java.util.Collection, java.util.Date, de.hybris.platform.jalo.order.AbstractOrder)
	 */
	@Override
	public RestrictionResult evaluate(final SessionContext ctx, final Collection<Product> products, final Date date,
			final AbstractOrder order)
	{
		final boolean positive = isPositiveAsPrimitive(ctx);
		if (getAssistedServiceFacade().isAssistedServiceAgentLoggedIn())
		{
			return ((positive) ? AbstractPromotionRestriction.RestrictionResult.ALLOW
					: AbstractPromotionRestriction.RestrictionResult.DENY);
		}
		return ((positive) ? AbstractPromotionRestriction.RestrictionResult.DENY
				: AbstractPromotionRestriction.RestrictionResult.ALLOW);
	}

	/**
	 * @return the assistedServiceFacade
	 */
	public AssistedServiceFacade getAssistedServiceFacade()
	{
		if (assistedServiceFacade == null)
		{
			setAssistedServiceFacade(assistedServiceFacade = Registry.getApplicationContext().getBean("assistedServiceFacade",
					AssistedServiceFacade.class));
		}
		return assistedServiceFacade;
	}

	/**
	 * @param assistedServiceFacade
	 *           the assistedServiceFacade to set
	 */
	public void setAssistedServiceFacade(final AssistedServiceFacade assistedServiceFacade)
	{
		this.assistedServiceFacade = assistedServiceFacade;
	}


}
