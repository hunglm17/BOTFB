/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botski.selenium;

/**
 *
 * @author HungThuy
 */
public class Person {

    private String name;
    private String profileLink;
    private String addLink;

    public Person() {
        name = "";
        profileLink = "";
        addLink = "";
    }

    public String __str__() {
        String s = "";
        s += this.name + ":\n";
        s += "Profile Link: " + this.profileLink;
        if (this.addLink != "") {
            s += "Addlink ->: " + this.addLink;
        }
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileLink() {
        return profileLink;
    }

    public void setProfileLink(String profileLink) {
        this.profileLink = profileLink;
    }

    public String getAddLink() {
        return addLink;
    }

    public void setAddLink(String addLink) {
        this.addLink = addLink;
    }

}
