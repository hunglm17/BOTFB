/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botski.example;

import botski.selenium.FacebookBot;

/**
 *
 * @author HungThuy
 */
public class Main {

    public static void main(String[] args) {
        FacebookBot bt = new FacebookBot();
        bt.login("lived.and.devil@gmail.com", "Sp@123456");
        
        bt.postTextToTimeline("Chúc ai ðó ng? ngon");
    }
}
