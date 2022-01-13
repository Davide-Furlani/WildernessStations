package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Station extends PageObject {

    @FindBy(className = "card-title")
    private WebElement stationName;
    @FindBy(xpath = "//span[@id='longitude']")
    private WebElement stationLongitude;
    @FindBy(xpath = "//span[@id='latitude']")
    private WebElement stationLatitude;
    @FindBy(xpath = "//span[@name='state']")
    private WebElement stationSate;
    @FindBy(xpath = "//a[@id='deleteBtn']")
    private WebElement deleteStationLink;
    @FindBy(xpath = "//a[@id='editBtn']")
    private WebElement editStationLink;
    @FindBy(tagName = "input")
    private WebElement searchStationInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = "//a[@id='homeBtn']")
    private WebElement goToHomeButton;
    @FindBy(xpath = "//th[@id='timestampBtn']")
    private WebElement timestampButton;
    @FindBy(xpath = "//th[@id='atmpressureBtn']")
    private WebElement atmpressureButton;
    @FindBy(xpath = "//th[@id='temperatureBtn']")
    private WebElement temperatureButton;
    @FindBy(xpath = "//th[@id='windspeedBtn']")
    private WebElement windspeedButton;
    @FindBy(className = "sorting_1")
    private List<WebElement> dataList;

    public Station(WebDriver driver) {
        super(driver);
    }

    public String getStationName() {
        return stationName.getText();
    }

    public Double getStationLongitude() {
        return Double.parseDouble(stationLongitude.getText());
    }

    public Double getStationLatitude() {
        return Double.parseDouble(stationLatitude.getText());
    }

    public Boolean getStationState() {
        if(stationSate.getText().equals("active"))
            return true;
        else
            return false;
    }

    public EditStation edit(){
        editStationLink.click();
        return new EditStation(driver);
    }

    public Station searchStation(long id) {
        searchStationInput.sendKeys(String.valueOf(id));
        searchButton.click();
        return new Station(driver);
    }

    public void deleteStation() {
        deleteStationLink.click();
    }

    public ArrayList<String> sortByTimestamp(){

        timestampButton.click();

        ArrayList<String> list = new ArrayList<>();
        dataList.forEach(element -> list.add(element.getText()));
        return list;
    }

    public ArrayList<String> sortByAtmPressure(){

        atmpressureButton.click();

        ArrayList<String> list = new ArrayList<>();
        dataList.forEach(element -> list.add(element.getText()));
        return list;
    }

    public ArrayList<String> sortByTemperature(){

        temperatureButton.click();

        ArrayList<String> list = new ArrayList<>();
        dataList.forEach(element -> list.add(element.getText()));
        return list;
    }

    public ArrayList<String> sortByWindspeed(){

        windspeedButton.click();

        ArrayList<String> list = new ArrayList<>();
        dataList.forEach(element -> list.add(element.getText()));
        return list;
    }

}
