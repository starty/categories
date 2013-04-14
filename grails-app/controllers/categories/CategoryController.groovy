package categories

import grails.converters.JSON

class CategoryController {

    def getCategories(){
        Category categTest = new Category()
        categTest.setCategoryId(1234)
        categTest.setName("Pelados")

        response.status = 200
        render categTest as JSON
    }
}
