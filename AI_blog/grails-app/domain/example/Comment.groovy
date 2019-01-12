package example

class Comment {
    Long commentID
    Date timestamp
    String text
    static mapping = {
        text type: "text"
    }
    static belongsTo = [user:User,articles:Article]

    static constraints = {
    }
}
