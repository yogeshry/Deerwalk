package example

class User {
    String name
    String email
    static hasMany = [comments:Comment,articles:Article]

    static constraints = {
    }
}
