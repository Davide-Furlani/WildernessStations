package it.univr.wildernessstations.ui;

import it.univr.wildernessstations.ui.pageobjects.Homepage;
import it.univr.wildernessstations.ui.utils.BaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomepageTest extends BaseTest {

    @Test
    public void homepageTest(){
        Homepage homepage = new Homepage(driver);
        assertEquals(10, homepage.getNumberOfStations());
        assertEquals("Sommacampagna", homepage.getFirstStationName());
    }

}
