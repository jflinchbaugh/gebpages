package gebpages

import geb.spock.*
import spock.lang.*


class GoogleSpec extends GebReportingSpec {
    def setupSpec() {
        go 'https://www.google.com/'
        println $('a')*.@href
    }

    def 'nothing'() {
        expect:
            true
    }
}
