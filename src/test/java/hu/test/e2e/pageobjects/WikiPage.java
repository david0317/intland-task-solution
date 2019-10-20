package hu.test.e2e.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WikiPage {

    public WikiPage checkProjectName(String projectName) {
        $("div.widget-title").shouldBe(visible).shouldHave(text("Welcome to" + projectName));
        $$(".generated-link").get(0).shouldBe(visible).shouldHave(text(projectName));
        return this;
    }

    public void createNewChild() {
        $("a[title='New Child Page']").shouldBe(visible, enabled).click();
        $("#inlinedPopupIframe").shouldBe(visible);
        switchTo().frame("inlinedPopupIframe");
        //return new NewChildDialog();
    }

    public void checkChildPage(String childName) {
        $(By.linkText(childName)).shouldBe(text(childName));
    }
}
