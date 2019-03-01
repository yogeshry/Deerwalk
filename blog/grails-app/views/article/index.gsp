<!doctype html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'article.label', default: 'Article')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
    <g:javascript library="jquery"/>
</head>

<body>
    <a href="#list-article" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
    <div class="nav" role="navigation">
        <ul>
            <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
            <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
        </ul>
    </div>
    <div id="list-article" class="content scaffold-list" role="main">
        <h1><g:message code="default.list.label" args="[entityName]" /></h1>
        <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
        </g:if>
        <f:table collection="${articleList}" />

        <div class="pagination">
            <g:paginate total="${articleCount ?: 0}" />
        </div>
    </div>
    <br style = "line-height:3"><br>

    %{--download button for CSV--}%
    <g:remoteLink action="prepareCSV" onLoading ="showSpinner()" onComplete="hideSpinner()" >download all as CSV</g:remoteLink>
    <div class="btn" id="downloadLink" style="display:none">
        <g:link action="saveLarge" id="downloadLink" style="display:block">File prepared ! click to download</g:link>
    </div>
    <div class="btn btn-primary " id="spinner" style="display:none">
        <span class="spinner-border spinner-border-sm"></span>
        Preparing<i class="fa fa-spinner fa-spin" style="font-size:24px"></i>
    </div>
    <br style = "line-height:3"><br>



    <script>
        function showSpinner() {
            var x = document.getElementById("spinner");
            var y = document.getElementById("downloadLink");
            y.style.display = "none";
            x.style.display = "block";
        }
        function hideSpinner() {
            var x = document.getElementById("spinner");
            var y = document.getElementById("downloadLink");
            y.style.display = "block";
            x.style.display = "none";
        }
    </script>


</body>
</html>