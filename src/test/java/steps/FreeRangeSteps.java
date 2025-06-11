package steps;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PrincipalPage;

public class FreeRangeSteps {

    PrincipalPage landingPage = new PrincipalPage();
    PaginaCursos curosPage = new PaginaCursos();

    @Given("I navigate to www.freerangetesters.com")

    public void iNavigateToFreeRangeTesters() {
        landingPage.maximizeWindow();
        landingPage.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @And("select Introducción al Testing de Software")
    public void navitageToIntroTesting(){
        curosPage.fundamentosTestingLink();
    }

}
