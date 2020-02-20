package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {

    @Before
    public void before() {

        user
                .auth()
                .login("petrenkovira19890206@gmail.com", "love19890206love2");
    }

    @Test
    public void searchBySearchTermTest() {
        user
                .validatePageTitle("")
                .homePage()
                .searchFor("hr");
        user
                .validatePageTitle("")
                .searchPage()
                .verifyEachResultContains("hr");

    }
}
