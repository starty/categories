import categories.Category

class CategoryMarshaller {

    static marshall(Category categ){
        def map = [:]

        map.categoryId = categ.categoryId
        map.name = categ.name

        return map
    }
}
