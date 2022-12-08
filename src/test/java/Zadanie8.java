import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie8 {

    private WebDriver driver;

    @Test
    public void iloscLinkowNaStronie() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.bbc.com/");

    }
}

