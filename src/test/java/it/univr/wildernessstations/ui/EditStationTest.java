package it.univr.wildernessstations.ui;

import it.univr.wildernessstations.ui.pageobjects.EditStation;
import it.univr.wildernessstations.ui.pageobjects.Homepage;
import it.univr.wildernessstations.ui.pageobjects.Station;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditStationTest extends BaseTest{

    @Test
    public void editStationValidTest(){

        String newName = "La bassa veronese";
        Double newLatitude = 7.0;
        Double newLongitude = 13.0;
        Boolean newState = false;

        Homepage homepage = new Homepage(driver);

        Station stationPage = homepage.searchStation(4);
        EditStation editStation = stationPage.edit();
        editStation.sendToForm(newName, newLatitude.toString(), newLongitude.toString(), newState);
        stationPage = editStation.submit();
        assertEquals("La bassa veronese", stationPage.getStationName());
        assertEquals(newLatitude, stationPage.getStationLatitude());
        assertEquals(newLongitude, stationPage.getStationLongitude());
        assertEquals(newState, stationPage.getStationState());


        //rollBack della modifica
        newName = "Bovolone";
        newLatitude = 45.257620;
        newLongitude = 11.120743;
        newState = true;

        homepage = new Homepage(driver);

        stationPage = homepage.searchStation(4);
        editStation = stationPage.edit();
        editStation.sendToForm(newName, newLatitude.toString(), newLongitude.toString(), newState);
        stationPage = editStation.submit();
        assertEquals("Bovolone", stationPage.getStationName());
        assertEquals(newLatitude, stationPage.getStationLatitude());
        assertEquals(newLongitude, stationPage.getStationLongitude());
        assertEquals(newState, stationPage.getStationState());
    }

    @Test
    public void editStationInvalidFieldTest(){

        Boolean newState = false;

        Homepage homepage = new Homepage(driver);

        Station stationPage = homepage.searchStation(4);
        EditStation editStation = stationPage.edit();
        editStation.sendToForm("", "", "", newState);
        editStation.submit();

        assertEquals("A valid station name is required.", editStation.invalidName.getText());
        assertEquals("Please insert a valid latitude.", editStation.invalidLatitude.getText());
        assertEquals("Please insert a valid longitude.", editStation.invalidLongitude.getText());
    }
}
