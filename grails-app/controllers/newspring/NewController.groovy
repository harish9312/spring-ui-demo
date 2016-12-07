package newspring
import grails.plugin.springsecurity.annotation.Secured
class NewController {
    
    @Secured('ROLE_USER')
    def index() { 
 
        render ("Hello")
    }
}
