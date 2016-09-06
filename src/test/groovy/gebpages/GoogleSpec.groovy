package gebpages

import geb.spock.*
import spock.lang.*


class GoogleSpec extends GebReportingSpec {
    def setupSpec() {
        go 'https://www.google.com/'
    }

    def 'nothing'() {
        expect:
            true
    }
}
