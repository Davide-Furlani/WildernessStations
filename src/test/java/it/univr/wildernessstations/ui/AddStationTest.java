package it.univr.wildernessstations.ui;

import it.univr.wildernessstations.ui.pageobjects.AddStation;
import it.univr.wildernessstations.ui.pageobjects.Homepage;
import it.univr.wildernessstations.ui.pageobjects.Station;
import org.junit.Test;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@Transactional
public class AddStationTest extends BaseTest{

    @Test
    public void addStationTest() {
        Homepage homepage = new Homepage(driver);
        AddStation addStationPage = homepage.navigateToAddStation();
        Station stationPage = addStationPage.addStation("Test-station", "10.0", "10.0");
        assertEquals("Test-station", stationPage.getStationName());
        stationPage.deleteStation();
    }

    @Test
    public void wrongStationDataTest() {
        Homepage homepage = new Homepage(driver);
        AddStation addStationPage = homepage.navigateToAddStation();
        addStationPage.addStation("Wrong-data", "a", "10.0");
        assertTrue(addStationPage.isLatitudeInvalid());
        assertFalse(addStationPage.isLongitudeInvalid());
    }

    @Test
    public void emptyFieldsTest() {
        Homepage homepage = new Homepage(driver);
        AddStation addStationPage = homepage.navigateToAddStation();
        addStationPage.submitEmptyForm();
        assertTrue(addStationPage.isLatitudeInvalid());
        assertTrue(addStationPage.isLongitudeInvalid());
    }

}
