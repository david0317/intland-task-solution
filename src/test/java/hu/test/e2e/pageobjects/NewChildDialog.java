package hu.test.e2e.pageobjects;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class NewChildDialog {

    public NewChildDialog setNewWikiChildPageName(String pageName) {
        $("#name").shouldBe(visible).setValue(pageName);
        return this;

    }

    public void saveNewWikiChildPage() {
        $("input.saveButton").shouldBe(visible, enabled).click();
    }
}
