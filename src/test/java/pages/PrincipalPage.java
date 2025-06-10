package pages;

public class PrincipalPage extends BasePage {

    String btnVerPlanDeCarreraIntroQA = "//a[@href='https://www.freerangetesters.com/nivel-inicial-fundamentos-del-testing']";

    public PrincipalPage() {
        super(driver);
    }

    // Metodo para navegar a www.frreerangeteter.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
    }

}
