package demo

import grails.web.api.ServletAttributes

class DemoService implements ServletAttributes {

    String getValueFromSession() {
        session.someValue?.toUpperCase()
    }
}
