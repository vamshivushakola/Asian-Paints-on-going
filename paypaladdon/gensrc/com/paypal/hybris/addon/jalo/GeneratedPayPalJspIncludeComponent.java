/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 18, 2016 6:07:30 PM                     ---
 * ----------------------------------------------------------------
 */
package com.paypal.hybris.addon.jalo;

import com.paypal.hybris.addon.constants.PaypaladdonConstants;
import de.hybris.platform.acceleratorcms.jalo.components.JspIncludeComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.JspIncludeComponent PayPalJspIncludeComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPayPalJspIncludeComponent extends JspIncludeComponent
{
	/** Qualifier of the <code>PayPalJspIncludeComponent.feature</code> attribute **/
	public static final String FEATURE = "feature";
	/** Qualifier of the <code>PayPalJspIncludeComponent.feature1</code> attribute **/
	public static final String FEATURE1 = "feature1";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(JspIncludeComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FEATURE, AttributeMode.INITIAL);
		tmp.put(FEATURE1, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalJspIncludeComponent.feature</code> attribute.
	 * @return the feature
	 */
	public SimpleCMSComponent getFeature(final SessionContext ctx)
	{
		return (SimpleCMSComponent)getProperty( ctx, FEATURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalJspIncludeComponent.feature</code> attribute.
	 * @return the feature
	 */
	public SimpleCMSComponent getFeature()
	{
		return getFeature( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalJspIncludeComponent.feature</code> attribute. 
	 * @param value the feature
	 */
	public void setFeature(final SessionContext ctx, final SimpleCMSComponent value)
	{
		setProperty(ctx, FEATURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalJspIncludeComponent.feature</code> attribute. 
	 * @param value the feature
	 */
	public void setFeature(final SimpleCMSComponent value)
	{
		setFeature( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalJspIncludeComponent.feature1</code> attribute.
	 * @return the feature1
	 */
	public SimpleCMSComponent getFeature1(final SessionContext ctx)
	{
		return (SimpleCMSComponent)getProperty( ctx, FEATURE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalJspIncludeComponent.feature1</code> attribute.
	 * @return the feature1
	 */
	public SimpleCMSComponent getFeature1()
	{
		return getFeature1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalJspIncludeComponent.feature1</code> attribute. 
	 * @param value the feature1
	 */
	public void setFeature1(final SessionContext ctx, final SimpleCMSComponent value)
	{
		setProperty(ctx, FEATURE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalJspIncludeComponent.feature1</code> attribute. 
	 * @param value the feature1
	 */
	public void setFeature1(final SimpleCMSComponent value)
	{
		setFeature1( getSession().getSessionContext(), value );
	}
	
}
