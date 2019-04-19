package converter

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/convert/index")
        "500"(view:'/convert/result')
        "404"(view:'/notFound')
    }
}
