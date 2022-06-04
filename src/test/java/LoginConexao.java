import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginConexao {
    private WebDriver driver;

    //iniciando
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    //finalizando
    @After
    public void tearDown() {
       driver.quit();
    }

    @Test
    public void loginConexao() {
        driver.get("https://conexaoqa.herokuapp.com/");
        assertThat(driver.findElement(By.cssSelector("*[data-test=\"landing-login\"]")).getText(), is("Login"));
        driver.findElement(By.cssSelector("*[data-test=\"landing-login\"]")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("schermack07tiago@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Tiago125");
        driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    }
}
