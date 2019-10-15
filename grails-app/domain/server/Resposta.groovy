package server

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Resposta {

    String respostas

    static constraints = {
        respostas blank: false
    }
}
