import mx.com.sintelti.Role
import mx.com.sintelti.User
import mx.com.sintelti.UserRole
class BootStrap {

    def init = { servletContext ->
    	def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true) 
	def userRole = new Role(authority: 'ROLE_USER').save(flush: true)

    	def testUser = new User(username: 'Alejandra', enabled: true, password: 'sintelti') 
	testUser.save(flush: true)

	UserRole.create testUser, adminRole, true
        assert User.count() == 1 
	assert Role.count() == 2
	assert UserRole.count() == 1
    }
}
