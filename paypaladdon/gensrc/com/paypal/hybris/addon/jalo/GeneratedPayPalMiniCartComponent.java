/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 18, 2016 6:07:30 PM                     ---
 * ----------------------------------------------------------------
 */
package com.paypal.hybris.addon.jalo;

import com.paypal.hybris.addon.constants.PaypaladdonConstants;
import com.paypal.hybris.addon.jalo.PayPalCreditShortcut;
import com.paypal.hybris.addon.jalo.PayPalExpressCheckoutShortcut;
import de.hybris.platform.acceleratorcms.jalo.components.MiniCartComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.MiniCartComponent PayPalMiniCartComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPayPalMiniCartComponent extends MiniCartComponent
{
	/** Qualifier of the <code>PayPalMiniCartComponent.payPalExpressCheckoutShortcut</code> attribute **/
	public static final String PAYPALEXPRESSCHECKOUTSHORTCUT = "payPalExpressCheckoutShortcut";
	/** Qualifier of the <code>PayPalMiniCartComponent.payPalCreditShortcut</code> attribute **/
	public static final String PAYPALCREDITSHORTCUT = "payPalCreditShortcut";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(MiniCartComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PAYPALEXPRESSCHECKOUTSHORTCUT, AttributeMode.INITIAL);
		tmp.put(PAYPALCREDITSHORTCUT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalMiniCartComponent.payPalCreditShortcut</code> attribute.
	 * @return the payPalCreditShortcut
	 */
	public PayPalCreditShortcut getPayPalCreditShortcut(final SessionContext ctx)
	{
		return (PayPalCreditShortcut)getProperty( ctx, PAYPALCREDITSHORTCUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalMiniCartComponent.payPalCreditShortcut</code> attribute.
	 * @return the payPalCreditShortcut
	 */
	public PayPalCreditShortcut getPayPalCreditShortcut()
	{
		return getPayPalCreditShortcut( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalMiniCartComponent.payPalCreditShortcut</code> attribute. 
	 * @param value the payPalCreditShortcut
	 */
	public void setPayPalCreditShortcut(final SessionContext ctx, final PayPalCreditShortcut value)
	{
		setProperty(ctx, PAYPALCREDITSHORTCUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalMiniCartComponent.payPalCreditShortcut</code> attribute. 
	 * @param value the payPalCreditShortcut
	 */
	public void setPayPalCreditShortcut(final PayPalCreditShortcut value)
	{
		setPayPalCreditShortcut( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalMiniCartComponent.payPalExpressCheckoutShortcut</code> attribute.
	 * @return the payPalExpressCheckoutShortcut
	 */
	public PayPalExpressCheckoutShortcut getPayPalExpressCheckoutShortcut(final SessionContext ctx)
	{
		return (PayPalExpressCheckoutShortcut)getProperty( ctx, PAYPALEXPRESSCHECKOUTSHORTCUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayPalMiniCartComponent.payPalExpressCheckoutShortcut</code> attribute.
	 * @return the payPalExpressCheckoutShortcut
	 */
	public PayPalExpressCheckoutShortcut getPayPalExpressCheckoutShortcut()
	{
		return getPayPalExpressCheckoutShortcut( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalMiniCartComponent.payPalExpressCheckoutShortcut</code> attribute. 
	 * @param value the payPalExpressCheckoutShortcut
	 */
	public void setPayPalExpressCheckoutShortcut(final SessionContext ctx, final PayPalExpressCheckoutShortcut value)
	{
		setProperty(ctx, PAYPALEXPRESSCHECKOUTSHORTCUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayPalMiniCartComponent.payPalExpressCheckoutShortcut</code> attribute. 
	 * @param value the payPalExpressCheckoutShortcut
	 */
	public void setPayPalExpressCheckoutShortcut(final PayPalExpressCheckoutShortcut value)
	{
		setPayPalExpressCheckoutShortcut( getSession().getSessionContext(), value );
	}
	
}
