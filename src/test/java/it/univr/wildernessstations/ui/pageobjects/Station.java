package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Station extends PageObject {

    @FindBy(className = "card-title")
    private WebElement stationName;
    @FindBy(className = "btn-outline-danger")
    private WebElement deleteStationLink;

    public Station(WebDriver driver) {
        super(driver);
    }

    public String getStationName() {
        return stationName.getText();
    }

    public Homepage deleteStation() {
        deleteStationLink.click();
        return new Homepage(driver);
    }

}
