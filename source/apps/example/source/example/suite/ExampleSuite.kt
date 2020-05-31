package example.suite

import com.automation.remarks.junit5.Video
import example.InitProperties.gitLabMaster
import example.AuthProperties
import example.cases.ExampleTest
import example.cases.TestGoogle
import example.cases.TestYandex
import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Story
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.DisplayNameGeneration
import org.junit.jupiter.api.Test
import org.leadium.core.initFieldsByPropertyFile
import org.leadium.core.open
import org.leadium.junit5.displayname.DisplayNameGenerator
import org.leadium.junit5.displayname.TestCaseDisplayName
import org.leadium.report.adapter.allure.description.DescriptionBuilder

@Epic("EXAMPLE EPIC")
@DisplayName("Example Suite | positive")
@DisplayNameGeneration(DisplayNameGenerator::class)
class ExampleSuite : TestSuite() {


    @Test
    @Video
    @Feature("TEST")
    @Story("GOOGLE STORY")
    @TestCaseDisplayName(TestGoogle::class)
    fun googleTest() {
        testbaseurl = "https://google.com/"
        open(testbaseurl)
        val testCase = TestGoogle()
        with(DescriptionBuilder(testCase, userDir, gitLabMaster)) {
            appendPropertyFile(findResource("google.property"))
            apply()
        }
        testCase.initFieldsByPropertyFile(findResource("google.property"))
                .begin()
    }

    @Test
    @Video
    @Feature("TEST")
    @Story("YANDEX STORY")
    @TestCaseDisplayName(TestYandex::class)
    fun yandexTest() {
        testbaseurl = "https://market.yandex.ru/"
        open(testbaseurl)
        val testCase = TestYandex()
        with(DescriptionBuilder(testCase, userDir, gitLabMaster)) {
            appendPropertyFile(findResource("yandex.property"))
            apply()
        }
        testCase.initFieldsByPropertyFile(findResource("yandex.property"))
                .begin()
    }

    @Test
    @Video
    @Feature("TEST")
    @Story("EXAMPLE STORY")
    @TestCaseDisplayName(ExampleTest::class)

    fun wikiTest() {
        testbaseurl = "https://duckduckgo.com/"
        open(testbaseurl)
        val testCase = ExampleTest()
        with(DescriptionBuilder(testCase, userDir, gitLabMaster)) {
            appendPropertyFile(findResource("example.property"))
            apply()
        }
        testCase.initFieldsByPropertyFile(findResource("example.property"))
                .begin()
    }
    @AfterEach
    override fun afterEach() {
        super.afterEach()
    }
}