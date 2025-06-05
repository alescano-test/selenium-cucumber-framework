package pages;

public class PrincipalPage extends BasePage {

    public PrincipalPage(){
        super(driver);
    }

    //Mpetodo para navegar a www.frreerangeteter.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }
    
}
