package it.univr.wildernessstations.ui.pageobjects;

import it.univr.wildernessstations.ui.utils.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homepage extends PageObject {

    @FindBy(className = "card")
    private List<WebElement> stationsList;
    @FindBy(xpath = "//h5[1]")
    private WebElement firstStationName;

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public String getFirstStationName(){
        return firstStationName.getText();
    }

    public int getNumberOfStations(){
        return stationsList.size();
    }

}
