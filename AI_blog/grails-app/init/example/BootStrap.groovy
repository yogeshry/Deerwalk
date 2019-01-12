package example

class BootStrap {

    def init = { servletContext ->
        new Article(name:'y', sku:'yyh', price: 56).save()
        new Article(name:"yy", sku:'yyhh', price: 56).save()
    }
    def destroy = {
    }
}
