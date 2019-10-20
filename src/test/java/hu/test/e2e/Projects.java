package hu.test.e2e;

import hu.test.e2e.enums.TestUsers;
import hu.test.e2e.pageobjects.*;
import org.junit.Test;

/**
 * This is a solution for the Intland test task.
 * @author David Toth
 */
public class Projects extends BaseTest {

    private final String PATH_TO_PROJECT_FILE = "src/test/resources/Intland_Software's_Scrum_Template.zip";
    private final String WIKI_PAGE_CHILD_NAME = "chiild01";

    @Test
    public void CreateProjectAndWikiPage(){
        new WelcomePage().open().login(TestUsers.ADMIN.getUserName(), TestUsers.ADMIN.getUsersPassword());
        new NavBar().toProjects();
        new ProjectPage().createProject();
        String projectName = new CreateProjectPage()
                .uploadFile(PATH_TO_PROJECT_FILE)
                .toNextPage().getProjectName();
        new CreateProjectPage().finishProjectCreation();
        new WikiPage().checkProjectName(projectName).createNewChild();
        new NewChildDialog().setNewWikiChildPageName(WIKI_PAGE_CHILD_NAME).saveNewWikiChildPage();
        new WikiPage().checkChildPage(WIKI_PAGE_CHILD_NAME);
    }

    /*
    @Test
    public void deleteProject() {
        new WelcomePage().open().login(TestUsers.ADMIN.getUserName(), TestUsers.ADMIN.getUsersPassword());
        for(int i =1; i <= 2; i++ ) {
            open("/sysadmin/projectsList.spr");
            $("input#projectId1").click();
            $$("div.actionBar input.button").get(0).click();
            $$("div.ui-dialog-buttonset button").get(0).click();
        }
    }
    */
}
