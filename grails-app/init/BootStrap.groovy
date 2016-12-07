
class BootStrap {

    def init = { servletContext ->

    	newspring.User admin = new newspring.User(username:'harish', password:'harish',ennacled:'true').save()
    	newspring.Role role = new newspring.Role(authority:'ROLE_USER').save()
    	newspring.UserRole.create(admin, role)

    }
    def destroy = {
    }
}
