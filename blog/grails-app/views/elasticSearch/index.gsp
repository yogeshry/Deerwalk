<!DOCTYPE html>
<html>

<body>
<div class="jumbotron">
    <h2>Request</h2>
    <div id="content" role="main">
        <section class="row colset-2-its">
            <g:if test="${flash.message}">
                <div class="message" role="alert">
                    ${flash.message}
                </div>
            </g:if>

            <g:form controller="elasticSearch" action="search" >

                <div class="fieldcontain">
                    <g:textField name="keyword" placeholder="userid" required="" />
                </div>


                <fieldset>
                    <g:submitButton name="send" value="Send" />
                </fieldset>
            </g:form>
        </section>
    </div>
</div>
</body>
</html>
