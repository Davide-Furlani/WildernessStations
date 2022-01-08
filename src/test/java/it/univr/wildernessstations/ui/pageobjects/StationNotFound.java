package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StationNotFound extends PageObject {

    @FindBy(tagName = "h3")
    private WebElement notFound;

    public StationNotFound(WebDriver driver) {
        super(driver);
    }

    public String getNotFoundText(){
        return notFound.getText();
    }

}
