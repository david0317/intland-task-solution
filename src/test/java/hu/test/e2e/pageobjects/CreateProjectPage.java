package hu.test.e2e.pageobjects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CreateProjectPage {

    public CreateProjectPage uploadFile(String path) {
        $(By.name("file")).shouldBe(exist, enabled).uploadFile(new File(path));
        $(".qq-upload-success").shouldBe(visible);
        return this;
    }

    public CreateProjectPage toNextPage() {
        $("div.actionBar .button").shouldBe(visible, enabled).click();
        return this;
    }

    public void finishProjectCreation(){
        $("#finishButton").shouldBe(visible, enabled).click();
    }

    public String getProjectName(){
        return $("#name").shouldBe(visible).getText();
    }
}
