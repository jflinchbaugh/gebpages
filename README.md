# gebpages

A shared repository of Geb page classes for common websites.
Using these pages can give a quick start to browser automation
around these websites.

## Technology and Libraries

* Java
* [Groovy](http://www.groovy-lang.org/)
* [Geb](http://www.gebish.org/)
* [Selenium Web Driver](http://www.seleniumhq.org/projects/webdriver/)
* [GeckoDriver for Firefox](https://github.com/mozilla/geckodriver/releases)

## Sample Geb Code

```
Browser.drive {
    to GoogleSearch
    search('automation')
    results.each { r ->
        println "${r.title} - ${r.url}"
    }
    relatedSearches.each { s ->
        println "${s.title}"
    }
}
```

## Setup

0. Download, unpack,
   and copy the ```geckodriver```
   for Firefox into your path.
0. ```./gradlew clean test``` to run the existing test suite.
