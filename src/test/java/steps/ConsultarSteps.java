package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import runner.RunCucumberTest;

public class ConsultarSteps extends RunCucumberTest {
    HomePage homePage = new HomePage(driver);

   @Dado("^que eu estou no site da Timnova")
    public void  acessar_usuario() throws InterruptedException {
       homePage.acessarAplicacao();

   }

    @Quando("^aceeso a aplicação e procuro o usuario Luiz Souza$")
    public void aceeso_a_aplicação_e_procuro_o_usuario_Luiz_Souza() throws InterruptedException {


    }

    @Quando("^clico no botão de mais$")
    public void clico_no_botão_de_mais() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#root > div > div.sc-jqUVSM.jkrDKT > div.sc-jSMfEi.iuhvyf > div:nth-child(3) > div:nth-child(5) > div:nth-child(2) > svg")).click();

    }

    @Então("^o sistema me permite acessar as informaçoes do usuario$")
    public void o_sistema_me_permite_acessar_as_informçoes_do_usuario()  {
        String texto_nome = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > input")).getText();
        Assert.assertEquals(true,driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > input")).isDisplayed());
        System.out.println(texto_nome);



    }

    @Dado("^que eu ja tenha acessado o site$")
    public void que_eu_ja_tenha_acessado_o_site()  throws InterruptedException{
       homePage.acessarAplicacao();


    }

    @Dado("^procuro o usuario que eu quero editar$")
    public void procuro_o_usuario_que_eu_quero_editar() throws InterruptedException {
       Thread.sleep(1500);
       driver.findElement(By.cssSelector("#root > div > div.sc-jqUVSM.jkrDKT > div.sc-jSMfEi.iuhvyf > div:nth-child(3) > div:nth-child(5) > div:nth-child(3) > svg")).click();

    }

    @Quando("^eu clico no botão editar$")
    public void eu_clico_no_botão_editar()  {
        driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > input")).clear();


    }

    @Quando("^edito o Email do usuario$")
    public void edito_o_Email_do_usuario()  {
        driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > input")).sendKeys("luiz-souzasouza@gmail.com");

    }

    @Entao("^o sistema permite que eu edite o email do usuario$")
    public void o_sistema_permite_que_eu_edite_o_email_do_usuario()  {
       driver.findElement(By.cssSelector("#root > div > div.sc-bczRLJ.xufcW")).click();

    }

    @Quando("^encontro o usuario que sera deletado$")
    public void encontro_o_usuario_que_sera_deletado() throws Throwable {
        homePage.acessarAplicacao();

    }

    @Quando("^clico no botão deletar$")
    public void clico_no_botão_deletar() throws Throwable {
       driver.findElement(By.cssSelector("#root > div > div.sc-jqUVSM.jkrDKT > div.sc-jSMfEi.iuhvyf > div:nth-child(3) > div:nth-child(5) > div:nth-child(4) > svg")).click();
       driver.findElement(By.cssSelector("body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button")).click();
    }

    @Entao("^o usuario foi deletado com sucesso$")
    public void o_usuario_foi_deletado_com_sucesso() throws Throwable {
        String Deletar_Usuario = driver.findElement(By.cssSelector("body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button")).getText();
        Assert.assertEquals(true,driver.findElement(By.cssSelector("body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div:nth-child(2) > button")).isDisplayed());
        System.out.println(Deletar_Usuario);

    }

}
