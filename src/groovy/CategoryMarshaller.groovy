import categories.Category

class CategoryMarshaller {

    static marshall(Category categ){
        def map = [:]

        map.category_id = categ.categoryId
        map.name = categ.name

        return map
    }
}
