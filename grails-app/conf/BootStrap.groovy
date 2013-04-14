import grails.converters.JSON
import categories.Category
import CategoryMarshaller

class BootStrap {

    def init = { servletContext ->

        JSON.registerObjectMarshaller(Category) { CategoryMarshaller.marshall(it) }
    }
}
