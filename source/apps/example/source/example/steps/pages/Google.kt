package example.steps.pages
import com.codeborne.selenide.Condition.be
import com.codeborne.selenide.Condition.empty
import org.junit.jupiter.api.Assertions.assertEquals
import org.leadium.core.AbstractStep
import org.leadium.core.get
import org.leadium.utils.randomString
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import java.nio.charset.Charset
import java.util.Random
import java.util.concurrent.ThreadLocalRandom
import kotlin.streams.asSequence
import java.io.ByteArrayOutputStream
import java.io.PrintStream

const val length = 10;
const val listchars = "[a-zA-Z0-9]+";

class Google: AbstractStep()  {

    private val charPool : List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    fun GeneratingRandomString(): String {
        val randomString = ThreadLocalRandom.current()
                .ints(length.toLong(), 0, charPool.size)
                .asSequence()
                .map(charPool::get)
                .joinToString("")

        assert(randomString.matches(Regex(listchars)))
        assertEquals(length, randomString.length)
        return randomString
    }

    fun setSearchBoxChrome() {
        "Search Box"[By.xpath("//input[@name='q']")].set(GeneratingRandomString())
        //"Search Box"[By.xpath("//input[@name='q']")].set("Monkey")
    }

    fun enter() {
        "Search Box"[By.xpath("//input[@name='q']")].sendKeys(Keys.ENTER)
    }
    fun checkResultSearch() {
        "Search Result"[By.xpath("//*[@id='topstuff']")].should(be(empty))
    }

}