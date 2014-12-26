/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkycompany.ranorex.testp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Konst
 */
public class NewClass {

    public void test() {
        System.out.println("start");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.ranorex.com/web-testing-examples/vip");
        System.out.println("ввожу");
        driver.findElement(By.id("FirstName")).sendKeys("a;lkf;asdkf");
        System.out.println("ввел");
        String text = driver.findElement(By.id("FirstName")).getText();
        System.out.println("TEXT: " + text);
        System.out.println("good");
        driver.quit();
        System.out.println("finish");
    }
}
