package hu.test.e2e;

import com.codeborne.selenide.Configuration;;

public class BaseTest {
    {
        Configuration.baseUrl = "http://localhost:8081/cb/";
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
        //Configuration.headless = true;
    }
}
