package it.univr.wildernessstations.ui;

import it.univr.wildernessstations.ui.pageobjects.EditStation;
import it.univr.wildernessstations.ui.pageobjects.Homepage;
import it.univr.wildernessstations.ui.pageobjects.Station;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class SortDataTest extends BaseTest{

    @Test
    public void sortTest(){

        ArrayList<String> list;
        Homepage homepage = new Homepage(driver);
        Station stationPage = homepage.searchStation(4);

        list = stationPage.sortByTimestamp(); //decreasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("orario", list.get(i).compareTo(list.get(i+1))>=0);
        }

        list = stationPage.sortByTimestamp(); //increasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("orario", list.get(i).compareTo(list.get(i+1))<=0);
        }

        list = stationPage.sortByAtmPressure(); // increasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("pressione", list.get(i).compareTo(list.get(i+1))<=0);
        }

        list = stationPage.sortByAtmPressure(); // decreasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("pressione", list.get(i).compareTo(list.get(i+1))>=0);
        }

        list = stationPage.sortByTemperature(); // increasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("temperatura", list.get(i).compareTo(list.get(i+1))<=0);
        }

        list = stationPage.sortByTemperature(); // decreasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("temperatura", list.get(i).compareTo(list.get(i+1))>=0);
        }

        list = stationPage.sortByWindspeed(); // increasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("velocia vento", list.get(i).compareTo(list.get(i+1))<=0);
        }

        list = stationPage.sortByWindspeed(); // decreasing
        for(int i=0; i< list.size()-1; i++){
            assertTrue("velocia vento", list.get(i).compareTo(list.get(i+1))>=0);
        }
    }
}