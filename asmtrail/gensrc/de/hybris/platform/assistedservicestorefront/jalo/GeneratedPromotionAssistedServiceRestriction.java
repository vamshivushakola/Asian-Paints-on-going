/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 3, 2016 4:44:46 PM                      ---
 * ----------------------------------------------------------------
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

import de.hybris.platform.asmtrail.constants.AsmtrailConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.promotions.jalo.AbstractPromotionRestriction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.assistedservicestorefront.jalo.PromotionAssistedServiceRestriction PromotionAssistedServiceRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPromotionAssistedServiceRestriction extends AbstractPromotionRestriction
{
	/** Qualifier of the <code>PromotionAssistedServiceRestriction.positive</code> attribute **/
	public static final String POSITIVE = "positive";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPromotionRestriction.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(POSITIVE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute.
	 * @return the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public Boolean isPositive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, POSITIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute.
	 * @return the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public Boolean isPositive()
	{
		return isPositive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute. 
	 * @return the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public boolean isPositiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPositive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute. 
	 * @return the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public boolean isPositiveAsPrimitive()
	{
		return isPositiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute. 
	 * @param value the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public void setPositive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, POSITIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute. 
	 * @param value the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public void setPositive(final Boolean value)
	{
		setPositive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute. 
	 * @param value the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public void setPositive(final SessionContext ctx, final boolean value)
	{
		setPositive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PromotionAssistedServiceRestriction.positive</code> attribute. 
	 * @param value the positive - Specifies if this restriction is a positive (true) or negative (false) one.
	 */
	public void setPositive(final boolean value)
	{
		setPositive( getSession().getSessionContext(), value );
	}
	
}
