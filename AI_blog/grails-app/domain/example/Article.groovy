package example

class Article {
    Long articleID
    String title
    Date timestamp
    String textBody
    String imagePath
    String imageCaption
    static mapping = {
        textBody type: "text"
    }
    static hasMany = [comments:Comment]
    static belongsTo = [user:User]

    static constraints = {
    }
}
