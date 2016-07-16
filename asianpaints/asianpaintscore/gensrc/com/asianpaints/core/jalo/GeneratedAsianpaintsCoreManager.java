/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 16, 2016 10:37:02 PM                    ---
 * ----------------------------------------------------------------
 */
package com.asianpaints.core.jalo;

import com.asianpaints.core.constants.AsianpaintsCoreConstants;
import com.asianpaints.core.jalo.ApparelProduct;
import com.asianpaints.core.jalo.ApparelSizeVariantProduct;
import com.asianpaints.core.jalo.ApparelStyleVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsProduct;
import com.asianpaints.core.jalo.AsianpaintsSizeVariantProduct;
import com.asianpaints.core.jalo.AsianpaintsStyleVariantProduct;
import com.asianpaints.core.jalo.ComingSoonCustomer;
import com.asianpaints.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.europe1.jalo.PDTRow;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>AsianpaintsCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAsianpaintsCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isOnSale", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("contactNumber", AttributeMode.INITIAL);
		tmp.put("dateOfBirth", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("selectedAddons", AttributeMode.INITIAL);
		tmp.put("actualBasePrice", AttributeMode.INITIAL);
		tmp.put("actualTotalPrice", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("priceType", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.europe1.jalo.PriceRow", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute.
	 * @return the actualBasePrice
	 */
	public Double getActualBasePrice(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.ACTUALBASEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute.
	 * @return the actualBasePrice
	 */
	public Double getActualBasePrice(final AbstractOrderEntry item)
	{
		return getActualBasePrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute. 
	 * @return the actualBasePrice
	 */
	public double getActualBasePriceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getActualBasePrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute. 
	 * @return the actualBasePrice
	 */
	public double getActualBasePriceAsPrimitive(final AbstractOrderEntry item)
	{
		return getActualBasePriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute. 
	 * @param value the actualBasePrice
	 */
	public void setActualBasePrice(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.ACTUALBASEPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute. 
	 * @param value the actualBasePrice
	 */
	public void setActualBasePrice(final AbstractOrderEntry item, final Double value)
	{
		setActualBasePrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute. 
	 * @param value the actualBasePrice
	 */
	public void setActualBasePrice(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setActualBasePrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualBasePrice</code> attribute. 
	 * @param value the actualBasePrice
	 */
	public void setActualBasePrice(final AbstractOrderEntry item, final double value)
	{
		setActualBasePrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute.
	 * @return the actualTotalPrice
	 */
	public Double getActualTotalPrice(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Double)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.ACTUALTOTALPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute.
	 * @return the actualTotalPrice
	 */
	public Double getActualTotalPrice(final AbstractOrderEntry item)
	{
		return getActualTotalPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute. 
	 * @return the actualTotalPrice
	 */
	public double getActualTotalPriceAsPrimitive(final SessionContext ctx, final AbstractOrderEntry item)
	{
		Double value = getActualTotalPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute. 
	 * @return the actualTotalPrice
	 */
	public double getActualTotalPriceAsPrimitive(final AbstractOrderEntry item)
	{
		return getActualTotalPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute. 
	 * @param value the actualTotalPrice
	 */
	public void setActualTotalPrice(final SessionContext ctx, final AbstractOrderEntry item, final Double value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.ACTUALTOTALPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute. 
	 * @param value the actualTotalPrice
	 */
	public void setActualTotalPrice(final AbstractOrderEntry item, final Double value)
	{
		setActualTotalPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute. 
	 * @param value the actualTotalPrice
	 */
	public void setActualTotalPrice(final SessionContext ctx, final AbstractOrderEntry item, final double value)
	{
		setActualTotalPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.actualTotalPrice</code> attribute. 
	 * @param value the actualTotalPrice
	 */
	public void setActualTotalPrice(final AbstractOrderEntry item, final double value)
	{
		setActualTotalPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Customer.CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final Customer item)
	{
		return getContactNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Customer.CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final Customer item, final String value)
	{
		setContactNumber( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsProduct createAsianpaintsProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSPRODUCT );
			return (AsianpaintsProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AsianpaintsProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsProduct createAsianpaintsProduct(final Map attributeValues)
	{
		return createAsianpaintsProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSIZEVARIANTPRODUCT );
			return (AsianpaintsSizeVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AsianpaintsSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsSizeVariantProduct createAsianpaintsSizeVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ASIANPAINTSSTYLEVARIANTPRODUCT );
			return (AsianpaintsStyleVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AsianpaintsStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public AsianpaintsStyleVariantProduct createAsianpaintsStyleVariantProduct(final Map attributeValues)
	{
		return createAsianpaintsStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ComingSoonCustomer createComingSoonCustomer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.COMINGSOONCUSTOMER );
			return (ComingSoonCustomer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ComingSoonCustomer : "+e.getMessage(), 0 );
		}
	}
	
	public ComingSoonCustomer createComingSoonCustomer(final Map attributeValues)
	{
		return createComingSoonCustomer( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( AsianpaintsCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final SessionContext ctx, final Customer item)
	{
		return (Date)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Customer.DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth(final Customer item)
	{
		return getDateOfBirth( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final SessionContext ctx, final Customer item, final Date value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Customer.DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth
	 */
	public void setDateOfBirth(final Customer item, final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return AsianpaintsCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isOnSale</code> attribute.
	 * @return the isOnSale - Products which are on sale.
	 */
	public Boolean isIsOnSale(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.Product.ISONSALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isOnSale</code> attribute.
	 * @return the isOnSale - Products which are on sale.
	 */
	public Boolean isIsOnSale(final Product item)
	{
		return isIsOnSale( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isOnSale</code> attribute. 
	 * @return the isOnSale - Products which are on sale.
	 */
	public boolean isIsOnSaleAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIsOnSale( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isOnSale</code> attribute. 
	 * @return the isOnSale - Products which are on sale.
	 */
	public boolean isIsOnSaleAsPrimitive(final Product item)
	{
		return isIsOnSaleAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isOnSale</code> attribute. 
	 * @param value the isOnSale - Products which are on sale.
	 */
	public void setIsOnSale(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.Product.ISONSALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isOnSale</code> attribute. 
	 * @param value the isOnSale - Products which are on sale.
	 */
	public void setIsOnSale(final Product item, final Boolean value)
	{
		setIsOnSale( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isOnSale</code> attribute. 
	 * @param value the isOnSale - Products which are on sale.
	 */
	public void setIsOnSale(final SessionContext ctx, final Product item, final boolean value)
	{
		setIsOnSale( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isOnSale</code> attribute. 
	 * @param value the isOnSale - Products which are on sale.
	 */
	public void setIsOnSale(final Product item, final boolean value)
	{
		setIsOnSale( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.priceType</code> attribute.
	 * @return the priceType
	 */
	public EnumerationValue getPriceType(final SessionContext ctx, final PriceRow item)
	{
		return (EnumerationValue)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.PriceRow.PRICETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.priceType</code> attribute.
	 * @return the priceType
	 */
	public EnumerationValue getPriceType(final PriceRow item)
	{
		return getPriceType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.priceType</code> attribute. 
	 * @param value the priceType
	 */
	public void setPriceType(final SessionContext ctx, final PriceRow item, final EnumerationValue value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.PriceRow.PRICETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.priceType</code> attribute. 
	 * @param value the priceType
	 */
	public void setPriceType(final PriceRow item, final EnumerationValue value)
	{
		setPriceType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedAddons</code> attribute.
	 * @return the selectedAddons
	 */
	public List<String> getSelectedAddons(final SessionContext ctx, final AbstractOrderEntry item)
	{
		List<String> coll = (List<String>)item.getProperty( ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.SELECTEDADDONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.selectedAddons</code> attribute.
	 * @return the selectedAddons
	 */
	public List<String> getSelectedAddons(final AbstractOrderEntry item)
	{
		return getSelectedAddons( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedAddons</code> attribute. 
	 * @param value the selectedAddons
	 */
	public void setSelectedAddons(final SessionContext ctx, final AbstractOrderEntry item, final List<String> value)
	{
		item.setProperty(ctx, AsianpaintsCoreConstants.Attributes.AbstractOrderEntry.SELECTEDADDONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.selectedAddons</code> attribute. 
	 * @param value the selectedAddons
	 */
	public void setSelectedAddons(final AbstractOrderEntry item, final List<String> value)
	{
		setSelectedAddons( getSession().getSessionContext(), item, value );
	}
	
}
