package categories

class Category {

    Integer categoryId
    String siteId
    String name
    String status
    Date creationDate
    Date lastUpdated

    static constraints = {
        categoryId(unique:true, blank:false)
        name(blank:false, maxSize:100)
    }

    static mapping = {
        table 'category'
        version false
        id name: 'categoryId'
    }
}
