package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login {

    private WebDriver driver;

    @Given("^que acesso o conexaoQA$")
    public void queAcessoOConexaoQA() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        driver.get("https://conexaoqa.herokuapp.com/");

    }

    @And("^clico no login$")
    public void clicoNoLogin() {
       //driver.findElement(By.className("a.btn.btn-light")).click();
       driver.findElement(By.cssSelector("section.landing div.dark-overlay div.landing-inner div.buttons > a.btn.btn-light:nth-child(2)")).click();
    }

    @When("^coloco \"([^\"]*)\" e \"([^\"]*)\"$")
    public void colocoE(String usuario, String senha)  {
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("schermack07tiago@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("Tiago125");
        driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    }

    @Then("^sera exibido a tela de dashboard$")
    public void seraExibidoATelaDeDashboard() {
    }

    @And("^o botao de criar perfil estara sendo exibido$")
    public void oBotaoDeCriarPerfilEstaraSendoExibido() {
        driver.findElement(By.cssSelector("body:nth-child(2) div:nth-child(2) section.container > a.btn.btn-primary.my-1:nth-child(4)")).click();
    }

    @And("^visualizo a tela de criacao do perfil$")
    public void visualizoATelaDeCriacaoDoPerfil() throws IOException {
        imprimirEvidencia();
       // driver.quit();
    }

    public void imprimirEvidencia() throws IOException {
        File printFinal = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(printFinal, new File("target/evidencia.png"));
    }
}
