package it.univr.wildernessstations.ui.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditStation extends PageObject{

    @FindBy(xpath = "//input[@id='name']")
    private WebElement stationNameInput;

    @FindBy(xpath = "//input[@id='latitude']")
    private WebElement stationLatitudeInput;

    @FindBy(xpath = "//input[@id='longitude']")
    private WebElement stationLongitudeInput;

    @FindBy(xpath = "//input[@name='state']")
    private WebElement stationStateInput;

    @FindBy(xpath = "//button[@id='submitFormBtn']")
    private WebElement submitButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/div[2]/div[1]")
    public WebElement invalidName;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/div[3]/div[1]")
    public WebElement invalidLatitude;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/form[1]/div[4]/div[1]")
    public WebElement invalidLongitude;

    public EditStation(WebDriver driver) {
        super(driver);
    }

    public void sendToForm(String name, String latitude, String longitude, Boolean state){

        Boolean currentState;

        if(name != null){
            stationNameInput.clear();
            stationNameInput.sendKeys(name);
        }

        if(latitude != null){
            stationLatitudeInput.clear();
            stationLatitudeInput.sendKeys(latitude);
        }

        if(longitude != null){
            stationLongitudeInput.clear();
            stationLongitudeInput.sendKeys(longitude);
        }

        currentState = stationStateInput.isSelected();

        if(state != currentState)
                stationStateInput.click();

    }

    public Station submit(){
        submitButton.click();
        return new Station(driver);
    }
}
