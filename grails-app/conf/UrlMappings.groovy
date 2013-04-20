class UrlMappings {

	static mappings = {

		"/"(view:"/index")
		"500"(view:'/error')

        "/sites/$siteId" (controller: "category") {
            action = [ GET: "getCategoriesBySite"]
        }

        "/$categoryId" (controller: "category") {
            action = [ GET: "getCategoryById"]
        }
	}
}
