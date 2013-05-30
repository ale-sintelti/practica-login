package mx.com.sintelti

import grails.plugins.springsecurity.Secured

class SecureController {

    @Secured(['ROLE_ADMIN'])
    def index = {
      render (view:'welcome')
   }
}
