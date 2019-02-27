<%@ include file="/init.jsp" %>

test

<div id="appRoot<portlet:namespace />">Loading...</div>

<aui:script require="ReactApplicationModule as app">
	app.default('appRoot<portlet:namespace />');
</aui:script>