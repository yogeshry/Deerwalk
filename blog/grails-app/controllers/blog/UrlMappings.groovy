package blog

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'home')
        "/control"(view: '/index')
        "500"(view:'/error')
        "404"(view:'/notFound')
        "/template"(view: '/template')
    }
}
