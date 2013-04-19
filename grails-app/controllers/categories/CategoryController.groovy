package categories

import grails.converters.JSON

class CategoryController {

    def helperService
    def categoryService

    def getCategoriesBySite(){
        if(!params.siteId) {
            response.status = 403 // Forbidden
            render helperService.renderError("Parameter 'siteId' is mandatory.", "403")
            return
        }

        def categories = categoryService.getCategoriesBySite(params.siteId)

        if (categories) {
            response.status = 200
            render categories.sort{it.name} as JSON
            return
        }
        else{
            response.status = 404 // Forbidden
            render helperService.renderError("Categories for site "+params.categoryId+" not found.", "404")
            return
        }
    }

    def getCategoryById(){
        if(!params.categoryId) {
            response.status = 403 // Forbidden
            render helperService.renderError("Parameter 'categoryId' is mandatory.", "403")
            return
        }

        def category = categoryService.getCategoryById(Integer.parseInt(params.categoryId))

        if (category) {
            response.status = 200
            render category as JSON
            return
        }
        else{
            response.status = 404 // Forbidden
            render helperService.renderError("Category with id "+params.categoryId+" not found.", "404")
            return
        }
    }
}