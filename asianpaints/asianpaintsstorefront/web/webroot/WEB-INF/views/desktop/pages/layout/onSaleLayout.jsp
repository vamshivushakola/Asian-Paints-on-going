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
			<span class="red-sticker">
					50%
				<p>off</p>
				</span>
				<c:forEach items="${onSaleProductData}" var="product">
				<div class="head"><b>${product.name}</b></div>
<!--For getting product images on coming soon page  -->
			<td style="padding-right: 20px;">
			<a href="p/${product.code}"><img src="${product.thumbnail.url}" alt="${product.thumbnail.altText}" title="${product.thumbnail.altText}"/></a></td>
				<td>${product.summary}</td>
			</c:forEach>
			<!-- <span class="red-sticker">
					38%
				<p>off</p>
				</span> -->
		</ol>
		
	</div>
	
	 <script type="text/javascript" >
	 function goToPdp(code) {
		 $.ajax({
				type : "GET",
				data : str,
				url : "<c:url value='/**/p/{productCode:.*}'/>",
			});
}
</script>

		
</template:page>






 