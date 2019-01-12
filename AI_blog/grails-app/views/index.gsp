<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>  <!-- static layout from main.gsp-->
    <title>Welcome to AI an blog</title>
</head>
<body>
<content tag="nav">  <!-- pageProperty page.nav-->
    <a class="navbar-brand" href="#">Home</a>
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
</content>


<div id="content" role="main">
    <br/>
    <br/>



    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" >
            <div class="carousel-item active" style="height: 50vw">
                <asset:image src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Los Angeles" width="100%"/>
                <div class="carousel-caption" style="bottom: 20%">
                    <h3 style="font-size:2vw">Author</h3>
                    <h2 style="font-size:5vw">Title of the respective articles</h2>
                </div>
            </div>

            <div class="carousel-item" style="height: 50vw">
                <asset:image src="articleImages/00aiexports01-jumbo.jpg" alt="Chicago"  width="100%"/>
                <div class="carousel-caption" style="bottom: 20%">
                    <h3 style="font-size:2vw">Author</h3>
                    <h2 style="font-size:5vw">Title of the respective articles</h2>
                </div>
            </div>

            <div class="carousel-item" style="height: 50vw">
                <asset:image src="articleImages/merlin_148269525_018dd0d0-1c4d-4872-a46b-0ef5ff884552-superJumbo.jpg" alt="New York" width="100%"/>
                <div class="carousel-caption" style="bottom: 20%">
                    <h3 style="font-size:2vw">Author</h3>

                    <h2 style="font-size:5vw">Title of the respective articles</h2>
                </div>
            </div>

        </div>

            <div>
            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
            </div>

    </div>
    <br/>

    <div class="jumbotron">
        <div class="card-deck">
            <div class="card" style="width: 18rem;">
            <asset:image class="card-img-top" src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Card image cap"/>
            <div class="card-body">
                <h5 class="card-title">Card title</h5>
                <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
            </div>
            <div class="card" style="width: 18rem;">
                <asset:image class="card-img-top" src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <asset:image class="card-img-top" src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>
        <br/>
        <div class="card-deck">
            <div class="card" style="width: 18rem;">
                <asset:image class="card-img-top" src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <asset:image class="card-img-top" src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
            <div class="card" style="width: 18rem;">
                <asset:image class="card-img-top" src="articleImages/merlin_148912326_ee218eb7-6a3c-48e4-8d39-e41158b32af0-superJumbo.jpg" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        </div>

    </div>


    <section class="row colset-2-its">


    <div id="controllers" role="navigation">
            <h2>Available Controllers:</h2>
            <ul>
                <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                    <li class="controller">
                        <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                    </li>
                </g:each>
            </ul>
        </div>
    </section>
</div>

</body>
</html>
