package categories

class CategoryService {

    def getCategoriesBySite(String siteId) {
        return Category.findAllBySiteIdAndStatus(siteId, "active")
    }

    def getCategoryById(Integer categoryId) {
        return Category.findByCategoryId(categoryId)
    }
}
