import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {


    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\абвг\\IdeaProjects\\TinkoffTest\\geckodriver.exe");
        WebDriver driver  = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(1550, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.tinkoff.ru/");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[7]")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[2]")).click();
       driver.navigate().back();
       driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[2]/parent::div")).click();
        WebElement element = driver.findElement(By.xpath("/div>/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div/div/div[2]"));
       // driver.navigate().back();
//List<WebElement> chechboxes = driver.findElements(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div/div/div[1]/div"));
//chechboxes.get(6).click();


  //driver.quit();

}}
