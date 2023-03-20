package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() throws InterruptedException {
        driver.get("https://tinnova-teste-qa.vercel.app/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]")).click();
    }
}
