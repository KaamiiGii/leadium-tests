package example.cases

import com.codeborne.selenide.Condition.*
import example.steps.pages.Google
import org.leadium.core.TestCase
import org.leadium.core.get
import org.leadium.core.minus
import org.leadium.data.ByText
import example.AuthProperties
class TestGoogle : TestCase {

    lateinit var searchRequest: String
    lateinit var expectedResult: String
    lateinit var searchRequestMarket: String
    lateinit var setMin: String
    lateinit var setMax: String
    lateinit var Price: String

    override fun begin() {
        Google() - {
            setSearchBoxChrome()
            enter()
            checkResultSearch()
            //clickResult()
        }
    }
}