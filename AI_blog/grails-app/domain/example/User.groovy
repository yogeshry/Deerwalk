package example

class User {
    String name
    String email
    Long userID
    static hasMany = [comments:Comment,articles:Article]

    static constraints = {
    }
}
