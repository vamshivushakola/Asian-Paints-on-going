/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 3, 2016 4:44:46 PM                      ---
 * ----------------------------------------------------------------
 */
package com.paypal.hybris.addon.jalo;

import com.paypal.hybris.addon.constants.PaypaladdonConstants;
import com.paypal.hybris.addon.jalo.PayPalCreditFinancingBanner;
import com.paypal.hybris.addon.jalo.PayPalCreditShortcut;
import com.paypal.hybris.addon.jalo.PayPalExpressCheckoutMark;
import com.paypal.hybris.addon.jalo.PayPalExpressCheckoutShortcut;
import com.paypal.hybris.addon.jalo.PayPalJspIncludeComponent;
import com.paypal.hybris.addon.jalo.PayPalMiniCartComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>PaypaladdonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaypaladdonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public PayPalCreditFinancingBanner createPayPalCreditFinancingBanner(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PaypaladdonConstants.TC.PAYPALCREDITFINANCINGBANNER );
			return (PayPalCreditFinancingBanner)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PayPalCreditFinancingBanner : "+e.getMessage(), 0 );
		}
	}
	
	public PayPalCreditFinancingBanner createPayPalCreditFinancingBanner(final Map attributeValues)
	{
		return createPayPalCreditFinancingBanner( getSession().getSessionContext(), attributeValues );
	}
	
	public PayPalCreditShortcut createPayPalCreditShortcut(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PaypaladdonConstants.TC.PAYPALCREDITSHORTCUT );
			return (PayPalCreditShortcut)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PayPalCreditShortcut : "+e.getMessage(), 0 );
		}
	}
	
	public PayPalCreditShortcut createPayPalCreditShortcut(final Map attributeValues)
	{
		return createPayPalCreditShortcut( getSession().getSessionContext(), attributeValues );
	}
	
	public PayPalExpressCheckoutMark createPayPalExpressCheckoutMark(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PaypaladdonConstants.TC.PAYPALEXPRESSCHECKOUTMARK );
			return (PayPalExpressCheckoutMark)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PayPalExpressCheckoutMark : "+e.getMessage(), 0 );
		}
	}
	
	public PayPalExpressCheckoutMark createPayPalExpressCheckoutMark(final Map attributeValues)
	{
		return createPayPalExpressCheckoutMark( getSession().getSessionContext(), attributeValues );
	}
	
	public PayPalExpressCheckoutShortcut createPayPalExpressCheckoutShortcut(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PaypaladdonConstants.TC.PAYPALEXPRESSCHECKOUTSHORTCUT );
			return (PayPalExpressCheckoutShortcut)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PayPalExpressCheckoutShortcut : "+e.getMessage(), 0 );
		}
	}
	
	public PayPalExpressCheckoutShortcut createPayPalExpressCheckoutShortcut(final Map attributeValues)
	{
		return createPayPalExpressCheckoutShortcut( getSession().getSessionContext(), attributeValues );
	}
	
	public PayPalJspIncludeComponent createPayPalJspIncludeComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PaypaladdonConstants.TC.PAYPALJSPINCLUDECOMPONENT );
			return (PayPalJspIncludeComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PayPalJspIncludeComponent : "+e.getMessage(), 0 );
		}
	}
	
	public PayPalJspIncludeComponent createPayPalJspIncludeComponent(final Map attributeValues)
	{
		return createPayPalJspIncludeComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public PayPalMiniCartComponent createPayPalMiniCartComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PaypaladdonConstants.TC.PAYPALMINICARTCOMPONENT );
			return (PayPalMiniCartComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PayPalMiniCartComponent : "+e.getMessage(), 0 );
		}
	}
	
	public PayPalMiniCartComponent createPayPalMiniCartComponent(final Map attributeValues)
	{
		return createPayPalMiniCartComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return PaypaladdonConstants.EXTENSIONNAME;
	}
	
}
