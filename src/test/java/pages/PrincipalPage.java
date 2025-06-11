package pages;

public class PrincipalPage extends BasePage {

    private String hrefNavigationBar = "//a[normalize-space()='%s' and @href]";


    public PrincipalPage() {
        super(driver);
    }

    // Metodo para navegar a www.frreerangeteter.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section){
        //Reemplazar el marcador de pocisión $S en hrefNavigationBar con el nombre
        String xPathSection = String.format(hrefNavigationBar, section);
        clicElement(xPathSection);
    }

}
