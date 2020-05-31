package example.cases

import com.codeborne.selenide.Condition.*
import example.data.Link
import example.data.Wiki
import example.data.Yandex
import example.steps.pages.DuckDuckGo
import example.steps.pages.Wikipedia
import example.steps.pages.Google
import example.steps.pages.YandexMarket
import org.leadium.core.TestCase
import org.leadium.core.get
import org.leadium.core.minus
import org.leadium.data.ByText

class TestYandex : TestCase {

    lateinit var searchRequest: String
    lateinit var expectedResult: String
    lateinit var searchRequestMarket: String
    lateinit var setMin: String
    lateinit var setMax: String
    lateinit var Price: String

    override fun begin() {

        YandexMarket() - {
            setSearchBoxMarket(searchRequestMarket)
            enter()
            clickDelivery()
            clickShowall()
            clickAlienware()
            clickDell()
            setMinPrice(setMin)
            enterMinPrice()
            setMaxPrice(setMax)
            enterMaxPrice()
            clickPrice()
            //checkPrice(Yandex.monitorPrice)
        }
    }
}