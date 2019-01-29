package blog

import gorm.logical.delete.LogicalDelete

class Article implements LogicalDelete{
    String title
    String textBody
    String imagePath
    String imageCaption
    Date createdAt
    Date deletedAt
    Date updatedAt

    static mapping = {
        textBody type: "text"
        deleted column: "delFlag"
    }
    static hasMany = [comments:Comment]
    static belongsTo = [user:User]

    static constraints = {
    }
}