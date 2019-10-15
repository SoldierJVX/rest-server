package server


import grails.rest.*
import grails.converters.*

class RespostaController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RespostaController() {
        super(Resposta)
    }
}
