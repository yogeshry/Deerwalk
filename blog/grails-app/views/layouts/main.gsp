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

    <asset:stylesheet src="bootstrap/bootstrap.css"/>
    <asset:stylesheet src="fontAwesome/css/fontAwesome.css"/>
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
            <a class="nav-link" href="/misc/about">About <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/article/create">Post</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/misc/contact">Contact</a>
        </li>
    </ul>

    <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" style="padding:3px 3px 4px 4px">
            <i><asset:image src="search.svg" alt="AI Logo"/></i>
        </button>
    </form>

    <sec:ifNotLoggedIn>
        <li class="dropdown dropleft" style="list-style-type: none; padding-left: 25px; padding-right: 5px">
            <asset:image height="25px" src="user.svg" class="dropdown-toggle"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"/>
            <ul class="dropdown-menu" style="background-color: #0c5460" >
                <li style="text-align: center"><a href="/login/auth" style="color: #f3efe0">Log In</a></li>
                <hr style="background-color: #138496"/>

                <li style="text-align: center"><a href="/user/create" style="color: #f3efe0">Sign Up</a></li>
            </ul>
        </li>
    </sec:ifNotLoggedIn>

    <sec:ifLoggedIn>
        <li class="dropdown dropleft" style="list-style-type: none; padding-left: 25px; padding-right: 5px">
            <asset:image height="25px" src="user.svg" class="dropdown-toggle"  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"/>
            <ul class="dropdown-menu" style="background-color: #0c5460" >
                <li style="text-align: center" ><p style="color: #ffe8a1">Hello <sec:username/></p></li>
                <hr style="background-color: #138496"/>
                <li style="text-align: center" ><a href="#" style="color: #f3efe0">Profile</a></li>
                <hr style="background-color: #138496"/>
                <li style="text-align: center"><g:link controller="logout" style="color: #f3efe0">Logout</g:link></li>
            </ul>
        </li>
    </sec:ifLoggedIn>
    <g:remoteLink action="downloadCSV" />

</nav>

<g:layoutBody/>

<asset:javascript src="application.js"/>
</body>
</html>
