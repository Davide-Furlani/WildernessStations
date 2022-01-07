package it.univr.wildernessstations.ui;

import it.univr.wildernessstations.ui.pageobjects.Homepage;
import it.univr.wildernessstations.ui.pageobjects.StationNotFound;
import it.univr.wildernessstations.ui.utils.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchStationTest extends BaseTest {

    @Test
    public void searchStationNotPresentTest(){
        Homepage homepage = new Homepage(driver);
        StationNotFound notFoundPage = homepage.searchStationNotPresent(2000);
        assertEquals("The required station wasn't found.", notFoundPage.getNotFoundText());
    }

}
