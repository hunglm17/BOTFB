/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botski.selenium;

import botski.util.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author HungThuy
 */
public class FacebookBot {

    private WebDriver driver;

    public FacebookBot() {
//        FileInputStream fstream = new FileInputStream("cookie.file");
//        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
//        String strLine;
//        while ((strLine = br.readLine()) != null) {
//            // Print the content on the console
//            System.out.println(strLine);
//            String[] strCoo = strLine.split(":");
//            driver.manage().addCookie(new Cookie(strCoo[0], strCoo[1]));
//        }
//        br.close();

// File fout = new File("cookie.file");
//                FileOutputStream fos = new FileOutputStream(fout);
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
//                Set<Cookie> setCookie = driver.manage().getCookies();
//                for (Cookie item : setCookie) {
//                    bw.write(item.getName() + ":" + item.getValue());
//                    bw.newLine();
//                }
//                bw.close();
        Capabilities caps = new DesiredCapabilities();
        ((DesiredCapabilities) caps).setJavascriptEnabled(true);
        ((DesiredCapabilities) caps).setCapability("takesScreenshot", true);
        ((DesiredCapabilities) caps).setCapability(
                PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "D:\\1.SOFT\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe"
        );
        String myProxy = "192.168.193.13:3128";
        ((DesiredCapabilities) caps).setCapability(CapabilityType.PROXY,
                new Proxy().setHttpProxy(myProxy));
        this.driver = new PhantomJSDriver(caps);
        driver.manage().window().setSize(new Dimension(1024, 900));
    }

    public String getScrenshotName() {
        return "";
    }

    public void login(String email, String password) {
        String url = "https://mbasic.facebook.com";
        driver.get(url);
        WebElement formEmail = driver.findElement(By.name("email"));
        formEmail.sendKeys(email);
        WebElement formPassword = driver.findElement(By.name("pass"));
        formPassword.sendKeys(password);
        WebElement loginF = driver.findElement(By.id("login_form"));
        loginF.submit();
        Utils.getScrenshot(driver, "Login_");
    }

    public void logout() {
        String url = "https://mbasic.facebook.com/logout.php?h=AffSEUYT5RsM6bkY&t=1446949608&ref_component=mbasic_footer&ref_page=%2Fwap%2Fhome.php&refid=7";
        driver.get(url);
        Utils.getScrenshot(driver, "Logout_");
    }

    public void postTextToTimeline(String text) {
        String url = "https://mbasic.facebook.com/";
        driver.get(url);
        WebElement textbox = driver.findElement(By.name("xc_message"));
        textbox.sendKeys(text);
        WebElement submit = driver.findElement(By.name("view_post"));
        submit.click();
        Utils.getScrenshot(driver, "Post_");
    }

    public void newMessageToFriend(String friendname,
            String message,
            String image1,
            String image2,
            String image3) {
        String url = "https://mbasic.facebook.com/friends/selector/?return_uri=%2Fmessages%2Fcompose%2F&cancel_uri=https%3A%2F%2Fm.facebook.com%2Fmessages%2F&friends_key=ids&context=select_friend_timeline&refid=11";
        driver.get(url);
        WebElement q = driver.findElement(By.name("query"));
        q.sendKeys(friendname);
        q.sendKeys(Keys.ENTER);
        String id = "abc".split("/messages/compose/?ids=")[1].split("\"><span>\"")[0].split("\"><span>\"")[0];
        url = "https://mbasic.facebook.com/messages/compose/?ids=" + id;
        driver.get(url);
        WebElement t = driver.findElement(By.name("body"));
        t.sendKeys(message);
        t.sendKeys(Keys.ENTER);
        WebElement f1 = driver.findElement(By.name("file1"));
        WebElement f2 = driver.findElement(By.name("file2"));
        WebElement f3 = driver.findElement(By.name("file3"));
        if (image1 != null) {
            f1.sendKeys(image1);
        }
        if (image2 != null) {
            f2.sendKeys(image2);
        }
        if (image1 != null) {
            f3.sendKeys(image3);
        }
        WebElement send = driver.findElement(By.name("Send"));
        send.sendKeys(Keys.ENTER);
    }

    public void getPostInGroup(String url) {
        driver.get(url);
    }

    public void postInGroup(String groupURL, String text) {
        driver.get(groupURL);
    }

    public void postImageInGroup(String url, String text, String image1, String image2, String image3) {
        driver.get(url);
    }

    public void commentInPost(String postUrl, String text) {
    }

    public void getGroupMembers(String url) {
    }

    public void sendFriendRequest(String url) {
        driver.get(url);

    }

    public void messageToUrl(String url, String text) {
    }

    public void getGroups() {
    }

    public void getSuggestedGroups(String sendrequest) {
        String url = "https://m.facebook.com/groups/";

    }
};
