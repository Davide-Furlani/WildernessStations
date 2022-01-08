package it.univr.wildernessstations.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeasurementsRepository extends CrudRepository<Measurements, Long> {

    Measurements findById(long id);

    List<Measurements> findMeasurementsByStation (Station station);

    List<Measurements> findAll();

    @Query("select min(temperature) from Measurements")
    Double getMinTemperature();

    @Query("select max(temperature) from Measurements")
    Double getMaxTemperature();

    @Query("select avg(temperature) from Measurements")
    Double getAvgTemperature();

    @Query("select min(windSpeed) from Measurements")
    Double getMinWindspeed();

    @Query("select max(windSpeed) from Measurements")
    Double getMaxWindspeed();

    @Query("select avg(windSpeed) from Measurements")
    Double getAvgWindspeed();

    @Query("select min(atmPressure) from Measurements")
    Double getMinAtmpressure();

    @Query("select max(atmPressure) from Measurements")
    Double getMaxAtmpressure();

    @Query("select avg(atmPressure) from Measurements")
    Double getAvgAtmpressure();

    @Query("select count(distinct station) from Measurements")
    Double countDistictStation();

}
