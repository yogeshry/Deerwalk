<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>  <!-- static layout from main.gsp-->
    <title>Welcome to AI an blog</title>
</head>
<body>



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
                <asset:image src= "${mainArticle.imagePath[0]}" alt="Los Angeles" width="100%"/>
                <div class="carousel-caption" style="bottom: 20%">
                    <h3 style="font-size:2vw">${mainArticle.user[0].name}</h3>
                    <h2 style="font-size:3vw">${mainArticle.title[0]}</h2>
                    <a href="/article/show/1" class="btn btn-outline-primary">Read more</a>
                </div>
            </div>

            <div class="carousel-item" style="height: 50vw">
                <asset:image src="${mainArticle.imagePath[1]}"  alt="Chicago"  width="100%"/>
                <div class="carousel-caption" style="bottom: 20%">
                    <h3 style="font-size:2vw">${mainArticle.user[1].name}</h3>
                    <h2 style="font-size:3vw">${mainArticle.title[1]}</h2>
                    <a href="/article/show/2" class="btn btn-outline-primary">Read more</a>
                </div>
            </div>

            <div class="carousel-item" style="height: 50vw">
                <asset:image src="${mainArticle.imagePath[2]}" alt="New York" width="100%"/>
                <div class="carousel-caption" style="bottom: 20%">
                    <h3 style="font-size:2vw">${mainArticle.user[2].name}</h3>
                    <h2 style="font-size:3vw">${mainArticle.title[2]}</h2>
                <a href="/article/show/3" class="btn btn-outline-primary">Read more</a>
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
            <g:each var="article" in="${articles1}">

            <div class="card" style="width: 18rem;">
                <asset:image class="card-img-top" src="${article.imagePath}" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title">${article.title}</h5>
                    <p class="card-text" style=" overflow: hidden; text-overflow: ellipsis; max-height: 200px">${article.textBody}</p>
                    <a href="#" class="btn btn-primary">Read more</a>
                </div>
            </div>
            </g:each>
        </div>


        <br/>
        <div class="card-deck">
            <g:each var="article" in="${articles2}">

                <div class="card" style="width: 18rem;">
                    <asset:image class="card-img-top" src="${article.imagePath}" alt="Card image cap"/>
                    <div class="card-body" >
                        <h5 class="card-title" style=" overflow: hidden; text-overflow: ellipsis; max-height: 30px">${article.title}</h5>
                        <p class="card-text" style=" overflow: hidden; text-overflow: ellipsis; max-height: 200px">${article.textBody}</p>
                        <a href="#" class="btn btn-primary">Read more</a>
                    </div>
                </div>
            </g:each>

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
