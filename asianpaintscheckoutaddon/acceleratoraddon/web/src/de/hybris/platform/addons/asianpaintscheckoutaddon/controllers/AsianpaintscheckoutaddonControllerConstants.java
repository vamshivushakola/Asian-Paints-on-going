/*
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
 *
 */
package de.hybris.platform.addons.asianpaintscheckoutaddon.controllers;

/**
 */
public interface AsianpaintscheckoutaddonControllerConstants
{
	// implement here controller constants used by this extension

	//Vamshi added this to get gift wrap tab while checkout
	final String ADDON_PREFIX = "addon:/asianpaintscheckoutaddon/";
	String GiftWrapPage = ADDON_PREFIX + "pages/checkout/multi/giftWrapPage";

	//vamshi added this to get radio button while checkout
	String ChooseDeliveryMethodPage = ADDON_PREFIX + "pages/checkout/multi/chooseDeliveryMethod";
}
