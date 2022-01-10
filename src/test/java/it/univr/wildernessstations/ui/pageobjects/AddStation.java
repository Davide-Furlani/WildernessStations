package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddStation extends PageObject{

    @FindBy(id = "name")
    private WebElement stationNameInput;
    @FindBy(id = "latitude")
    private WebElement latitudeInput;
    @FindBy(id = "longitude")
    private WebElement longitudeInput;
    @FindBy(xpath = "//div[contains(text(), 'valid latitude')]")
    private WebElement invalidLatitude;
    @FindBy(xpath = "//div[contains(text(), 'valid longitude')]")
    private WebElement invalidLongitude;

    public AddStation(WebDriver driver) {
        super(driver);
    }

    /**
     * Add a new station
     * @param stationName name of the station
     * @param latitude latitude of the station
     * @param longitude longitude of the station
     * @return a page object representing the new station page, only if the provided data were valid
     */
    public Station addStation(String stationName, String latitude, String longitude) {
        stationNameInput.sendKeys(stationName);
        latitudeInput.sendKeys(latitude);
        longitudeInput.sendKeys(longitude);
        stationNameInput.submit();
        return new Station(driver);
    }
    
    public void submitEmptyForm() {
        stationNameInput.submit();
    }

    public boolean isLatitudeInvalid() {
        return invalidLatitude.isDisplayed();
    }

    public boolean isLongitudeInvalid() {
        return invalidLongitude.isDisplayed();
    }
}
