/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Konst
 */
public class First {

    public First() {
    }

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://www.ranorex.com/web-testing-examples/vip");
        Thread.sleep(5000);
        System.out.println("good");
        driver.quit();
    }

    @Test
    public void test2() {
        System.out.println("ooouueee theq are really good!!!");
    }

}
