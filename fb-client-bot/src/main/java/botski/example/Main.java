/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botski.example;

import botski.selenium.FacebookBot;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class Main {

    public static void main(String[] args) {
//        WebDriver driver = null;
        FacebookBot bt = null;
        try {
            /*String DOMAIN = "facebook.com";
             URL SERVER_URL = new URL("http://" + DOMAIN + "/");
             URL HUB_URL = new URL(SERVER_URL, "wd/hub");

             FacebookBot bt = new FacebookBot();
             driver = bt.getDriver();
             driver.get(HUB_URL.toString());
             driver.manage().addCookie(new Cookie("foo", "foo"));

             System.out.println("THIS-----:" + driver.manage().getCookieNamed("foo"));*/
//            Set<Cookie> allCookies = driver.manage().getCookies();
//            for (Cookie loadedCookie : allCookies) {
//                System.out.println("THIS-------------------------");
//                System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
//            }
            bt = new FacebookBot();
            bt.login("lived.and.devil@gmail.com", "Sp@123456");
//            bt.postTextToTimeline("Chúc ai ðó ng? ngon");
            bt.getSuggestedGroups(false);
        } catch (Exception ex) {
            System.out.println("ERR-----:" + ex);
        } finally {
            bt.logout();
        }
    }
}
