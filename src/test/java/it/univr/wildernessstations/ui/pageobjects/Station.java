package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Station extends PageObject {

    @FindBy(className = "card-title")
    private WebElement stationName;
    @FindBy(className = "btn-outline-danger")
    private WebElement deleteStationLink;
    @FindBy(tagName = "input")
    private WebElement searchStationInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    public Station(WebDriver driver) {
        super(driver);
    }

    public String getStationName() {
        return stationName.getText();
    }

    public Station searchStation(long id) {
        searchStationInput.sendKeys(String.valueOf(id));
        searchButton.click();
        return new Station(driver);
    }

    public void deleteStation() {
        deleteStationLink.click();
    }

}
