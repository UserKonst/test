/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mkycompany.ranorex.testp;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Konst
 */
public class NewClass {

    public void test() throws InterruptedException {
        System.out.println("start");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.ranorex.com/web-testing-examples/vip");
        Thread.sleep(2000);
        System.out.println("good");
        driver.quit();
        System.out.println("finish");
    }
}
