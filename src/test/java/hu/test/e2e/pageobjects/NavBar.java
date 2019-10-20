package hu.test.e2e.pageobjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class NavBar {

    public void toProjects() {
        $("#project_browser_ToolBarItem").shouldBe(visible, enabled).click();
    }
}
