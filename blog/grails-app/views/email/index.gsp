<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Email Sender</title>
    %{--<script src="//cdn.ckeditor.com/4.6.0/full-all/ckeditor.js"></script>--}%
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<br>
<br>
<br>
<br>
<div class="jumbotron">
    <h2>Compose</h2>
<div id="content" role="main">
    <section class="row colset-2-its">
        <g:if test="${flash.message}">
            <div class="message" role="alert">
                ${flash.message}
            </div>
        </g:if>

        <g:form controller="email" action="send" enctype="multipart/form-data">
            <br/>
            <div class="fieldcontain">
                <g:textField name="address" placeholder="Email" required="" />
                <p>For multiple users separate address by comma</p>
            </div>
            <div class="fieldcontain">
                <g:textField name="name" placeholder="Receipent" required="" />
                <p>For multiple Receipents separate names by comma</p>
            </div>
            <br/>
            <div class="fieldcontain">
                <g:textField name="subject" placeholder="Subject" required="" />
            </div>
            <br/>
            <br/>
            %{--<div class="fieldcontain">--}%
                %{--<g:textArea name="body" rows="5" cols="80" placeholder="Your message" required="" />--}%
            %{--</div>--}%
            <g:render template="/email/myTemplate" />
            <input type="file" name="attachment" placeholder="attachment"/>

            <fieldset>
                <g:submitButton name="send" value="Send" />
            </fieldset>
        </g:form>
    </section>
</div>
</div>
%{--<script>--}%
    %{--CKEDITOR.replace('body', {--}%
        %{--extraPlugins: 'codesnippet'--}%
    %{--});--}%
%{--</script>--}%
</body>
</html>