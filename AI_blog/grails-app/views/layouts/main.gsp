<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="AI"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="AI.ico" type="image/x-ico"/>

    <asset:stylesheet src="bootstrap.min.css"/>
    <asset:stylesheet src="bootstrap.css"/>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="bootstrap.bundle.min.js"/>
    <asset:javascript src="jquery-3.3.1.min.js"/>


    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" role="navigation">
    <a class="navbar-brand" href="/#"><asset:image src="brain.svg" alt="AI Logo"/></a>
        <a class="navbar-brand" href="/home">Home</a>
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item active">
                <a class="nav-link" href="#">About <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Post</a>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Contact</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit" style="padding:3px 3px 4px 4px">
                <i><asset:image src="search.svg" alt="AI Logo"/></i>
            </button>
        </form>

</nav>

<g:layoutBody/>

<asset:javascript src="application.js"/>

</body>
</html>
