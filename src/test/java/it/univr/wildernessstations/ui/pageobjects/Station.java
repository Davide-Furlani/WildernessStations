package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Station extends PageObject {

    @FindBy(className = "card-title")
    private WebElement stationName;

    public Station(WebDriver driver) {
        super(driver);
    }

    public String getStationName() {
        return stationName.getText();
    }

}
