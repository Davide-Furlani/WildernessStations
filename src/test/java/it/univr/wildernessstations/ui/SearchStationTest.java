package it.univr.wildernessstations.ui;

import it.univr.wildernessstations.ui.pageobjects.Homepage;
import it.univr.wildernessstations.ui.pageobjects.Station;
import it.univr.wildernessstations.ui.pageobjects.StationNotFound;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchStationTest extends BaseTest {

    @Test
    public void searchStationNotPresentTest() {
        Homepage homepage = new Homepage(driver);
        StationNotFound notFoundPage = homepage.searchStationNotPresent(2000);
        assertEquals("The required station wasn't found.", notFoundPage.getNotFoundText());
    }

    @Test
    public void searchNegativeIdTest() {
        Homepage homepage = new Homepage(driver);
        StationNotFound notFoundPage = homepage.searchStationNotPresent(-1);
        assertEquals("The required station wasn't found.", notFoundPage.getNotFoundText());
    }

    @Test
    public void searchStationTest() {
        Homepage homepage = new Homepage(driver);
        Station stationPage = homepage.searchStation(4);
        assertEquals("Bovolone", stationPage.getStationName());
        stationPage = stationPage.searchStation(0);
        assertEquals("Sommacampagna", stationPage.getStationName());
    }

}
