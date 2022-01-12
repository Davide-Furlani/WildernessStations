package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homepage extends PageObject {

    @FindBy(className = "card")
    private List<WebElement> stationsList;
    @FindBy(xpath = "//h5[1]")
    private WebElement firstStationName;
    @FindBy(tagName = "input")
    private WebElement searchStationInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;
    @FindBy(css = "a[href='addStation']")
    private WebElement addStationLink;

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public String getFirstStationName() {
        return firstStationName.getText();
    }

    public int getNumberOfStations() {
        return stationsList.size();
    }

    /**
     * use this method to search for a station that is NOT in the database
     *
     * @param id the id of the station to search
     * @return a page object representing the not found page
     */
    public StationNotFound searchStationNotPresent(long id) {
        searchStationInput.sendKeys(String.valueOf(id));
        searchStationInput.submit();
        return new StationNotFound(driver);
    }

    public Station searchStation(long id) {
        searchStationInput.sendKeys(String.valueOf(id));
        searchButton.click();
        return new Station(driver);
    }

    public AddStation navigateToAddStation(){
        addStationLink.click();
        return new AddStation(driver);
    }

}
