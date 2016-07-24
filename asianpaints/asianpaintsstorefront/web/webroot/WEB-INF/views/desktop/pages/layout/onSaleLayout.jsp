<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%-- <c:url var="saveCustomerData" value="/saveNotifyCustomer" /> --%>

<template:page pageTitle="${pageTitle}">

	<div id="globalMessages">
		<common:globalMessages />
	</div>
	<div id=productOnSaleDiv>
		<ol class="products-list" data-isOrderForm="false">
			<c:forEach items="${onSaleProductData}" var="product">
				
				<!--For getting product images on coming soon page  -->
				<table>
				<td style="padding-right: 20px;"><a href="p/${product.code}"><img
						src="${product.thumbnail.url}" alt="${product.thumbnail.altText}"
						title="${product.thumbnail.altText}" /></a></td>
				<b>${product.name}</b>
				<td>${product.summary}</td>
				
				<!-- <span class="red-sticker"> 50%
					<p>off</p>
				</span> -->
				</br>
				<c:forEach items="${product.europe1Prices}" var="productPrice">
				<font size="3" color="red">Price</font> ${productPrice.price}	
				</c:forEach>
				</table>
			</c:forEach>

		</ol>
		
	</div>
		
</template:page>






 