package hu.test.e2e.pageobjects;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class WelcomePage {

    public WelcomePage open() {
        Selenide.open("/login.spr");
        return this;
    }

    public void login(String user, String pass) {
         $("#user").shouldBe(visible).setValue(user);
         $("#password").shouldBe(visible).setValue(pass);
         $(".login_button").shouldBe(visible, enabled).click();
    }
}
