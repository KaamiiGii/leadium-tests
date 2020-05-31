package example.steps.pages

import com.codeborne.selenide.Condition.*
import org.leadium.core.AbstractStep
import org.leadium.core.get
import org.leadium.data.ByText
import org.openqa.selenium.By
import org.openqa.selenium.Keys



class YandexMarket: AbstractStep()  {

    fun setSearchBoxMarket(searchRequestMarket: String) {
        "Search Box"[By.xpath("//input[@id='header-search']")].set(searchRequestMarket)
    }

    fun enter() {
        "Search Box"[By.xpath("//input[@id='header-search']")].sendKeys(Keys.ENTER)
    }

    fun clickDelivery() {
        "Delivery"[By.xpath("//li[2]/div/label/div")].click()
    }
    fun clickShowall() {
        "Showall"[By.xpath("//footer/button")].click()
    }

    fun clickAlienware() {
        "Alienware"[By.xpath("//li[6]/div/a/label/div")].click()
    }
    fun clickDell() {
        "Dell"[By.xpath("//li[16]/div/a/label/div")].click()
    }

    fun setMinPrice(setMin: String) {
        "Min Price"[By.xpath("//p/input")].set(setMin)
    }

    fun enterMinPrice() {
        "Min Price"[By.xpath("//p/input")].sendKeys(Keys.ENTER)
    }

    fun setMaxPrice(setMax: String) {
        "Max Price"[By.xpath("//li[2]/p/input")].set(setMax)
    }

    fun enterMaxPrice() {
        "Max Price"[By.xpath("//li[2]/p/input")].sendKeys(Keys.ENTER)
    }

    fun clickPrice() {
        "Price"[By.xpath("//div[2]/div[5]/div[3]/div[1]/div[3]/div/div[1]/div[3]/div[5]/div[1]/div[1]/div[3]/div/a/div")]


    }

    fun checkPrice(monitorPrice: String) {
        "Result"[By.xpath("//*[@class=n-snippet-card2 i-bem b-zone b-spy-visible b-spy-events b-spy-visible_js_inited n-snippet-card2_js_inited][3]//div[@class=n-snippet-card2__main-price-wrapper]")]
                .click()
    }

/*    fun checkResult(){

    }*/
}