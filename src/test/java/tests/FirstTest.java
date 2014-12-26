package tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mkycompany.ranorex.testp.NewClass;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Konst
 */
public class FirstTest {

    public FirstTest() {
    }

    @Test
    public void test1() throws InterruptedException {
        NewClass cl = new NewClass();
        cl.test();
        System.out.println("дженкинс уебок");
    }

    @Test
    public void test2() {
        System.out.println("88888888888888888888888");
    }

}
