package it.univr.wildernessstations.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeasurementsRepository extends CrudRepository<Measurements, Long> {

    List<Measurements> findMeasurementsByStation (Station station);

    List<Measurements> findAll();

    @Query("select min(temperature) from Measurements")
    double getMinTemperature();

    @Query("select max(temperature) from Measurements")
    double getMaxTemperature();

    @Query("select avg(temperature) from Measurements")
    double getAvgTemperature();

    @Query("select min(windSpeed) from Measurements")
    double getMinWindspeed();

    @Query("select max(windSpeed) from Measurements")
    double getMaxWindspeed();

    @Query("select avg(windSpeed) from Measurements")
    double getAvgWindspeed();

    @Query("select min(atmPressure) from Measurements")
    double getMinAtmpressure();

    @Query("select max(atmPressure) from Measurements")
    double getMaxAtmpressure();

    @Query("select avg(atmPressure) from Measurements")
    double getAvgAtmpressure();

    @Query("select count(distinct station) from Measurements")
    int countDistinctStation();

}
