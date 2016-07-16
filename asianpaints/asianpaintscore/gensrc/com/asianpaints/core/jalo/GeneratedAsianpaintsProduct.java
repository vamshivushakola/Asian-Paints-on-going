/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 16, 2016 10:37:02 PM                    ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.asianpaints.core.jalo.AsianpaintsProduct AsianpaintsProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAsianpaintsProduct extends Product
{
	/** Qualifier of the <code>AsianpaintsProduct.isComingSoon</code> attribute **/
	public static final String ISCOMINGSOON = "isComingSoon";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ISCOMINGSOON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsProduct.isComingSoon</code> attribute.
	 * @return the isComingSoon - Products which are coming soon.
	 */
	public Boolean isIsComingSoon(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISCOMINGSOON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsProduct.isComingSoon</code> attribute.
	 * @return the isComingSoon - Products which are coming soon.
	 */
	public Boolean isIsComingSoon()
	{
		return isIsComingSoon( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsProduct.isComingSoon</code> attribute. 
	 * @return the isComingSoon - Products which are coming soon.
	 */
	public boolean isIsComingSoonAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsComingSoon( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AsianpaintsProduct.isComingSoon</code> attribute. 
	 * @return the isComingSoon - Products which are coming soon.
	 */
	public boolean isIsComingSoonAsPrimitive()
	{
		return isIsComingSoonAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsProduct.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Products which are coming soon.
	 */
	public void setIsComingSoon(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISCOMINGSOON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsProduct.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Products which are coming soon.
	 */
	public void setIsComingSoon(final Boolean value)
	{
		setIsComingSoon( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsProduct.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Products which are coming soon.
	 */
	public void setIsComingSoon(final SessionContext ctx, final boolean value)
	{
		setIsComingSoon( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AsianpaintsProduct.isComingSoon</code> attribute. 
	 * @param value the isComingSoon - Products which are coming soon.
	 */
	public void setIsComingSoon(final boolean value)
	{
		setIsComingSoon( getSession().getSessionContext(), value );
	}
	
}
