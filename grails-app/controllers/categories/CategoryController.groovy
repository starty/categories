package categories

import grails.converters.JSON

class CategoryController {

    def categoryService

    def getCategoriesBySite(){
        def categories = categoryService.getCategoriesBySite(params.siteId)

        response.status = 200
        render categories.sort{it.name} as JSON
    }

    def getCategoryById(){
        def category = categoryService.getCategoryById(Integer.parseInt(params.categoryId))

        response.status = 200
        render category as JSON
    }
}