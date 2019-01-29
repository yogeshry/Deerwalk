package blog
import gorm.logical.delete.LogicalDelete


class Comment implements LogicalDelete<Comment> {
    String text
    Date createdAt
    Date deletedAt
    Date updatedAt

    static mapping = {
        text type: "text"
        deleted column: "delFlag"
    }
    static belongsTo = [user:User,articles:Article]

    static constraints = {
    }
}
