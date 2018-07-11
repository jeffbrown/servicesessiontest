package demo

import grails.testing.services.ServiceUnitTest
import grails.testing.web.GrailsWebUnitTest
import spock.lang.Specification

class DemoServiceSpec extends Specification implements ServiceUnitTest<DemoService>, GrailsWebUnitTest {

    void "test something"() {
        given:
        session.someValue = 'Jeff Was Here'
        
        expect:
        service.valueFromSession == 'JEFF WAS HERE'
    }
}
