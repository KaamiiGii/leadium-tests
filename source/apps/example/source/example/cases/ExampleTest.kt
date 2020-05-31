package example.cases

import com.codeborne.selenide.Condition.*
import example.data.Link
import example.data.Wiki
import example.steps.pages.DuckDuckGo
import example.steps.pages.Wikipedia
import example.steps.pages.Google
import example.steps.pages.YandexMarket
import org.leadium.core.TestCase
import org.leadium.core.get
import org.leadium.core.minus
import org.leadium.data.ByText

class ExampleTest : TestCase {

    lateinit var searchRequest: String
    lateinit var expectedResult: String

    override fun begin() {
        DuckDuckGo() - {
            setSearchBox(searchRequest)
            enter()
            checkResult(expectedResult)
            clickResult()
        }
        Wikipedia() - {
            checkResult(expectedResult)
            checkLogoTitle(Wiki.logoTitle)
            checkSearchInput()
            Link.mathematics[ByText()].click()
            Link.`Main page`[ByText()].click()
            checkLogoCondition(be(not(focused)))
        }
    }
}