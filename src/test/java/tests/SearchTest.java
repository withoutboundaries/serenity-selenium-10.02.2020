package tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;


@RunWith(SerenityParameterizedRunner.class)
public class SearchTest extends BaseTest {

    private String searchTerm;


    public SearchTest(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[] []{
                {"HR"},
                {"hr"},
                {"Human Resources"}
        });
    }

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
                .searchFor(searchTerm);
        user
                .validatePageTitle("")
                .searchPage()
                .verifyEachResultContains(searchTerm);

    }
}
