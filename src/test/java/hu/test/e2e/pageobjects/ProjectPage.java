package hu.test.e2e.pageobjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {

    public void createProject() {
        $("div#project-categories input").shouldBe(visible, enabled).click();
    }
}
