package pages;

public class PaginaCursos extends BasePage {

    private String fundamentosTestingLink = "//h3[normalize-space()='Introducción al Testing de Software']";

    public PaginaCursos() {
        super(driver);
    }

    public void fundamentosTestingLink() {
        clicElement(fundamentosTestingLink);
    }

}
