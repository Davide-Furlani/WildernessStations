package it.univr.wildernessstations.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Measurements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Station station;
    private Double temperature;
    private Double atmPressure;
    private Double windSpeed;
    private Timestamp timeStamp;

    public Measurements(){
    }

    public Measurements(Station station, Double temperature, Double atmPressure, Double windSpeed, Timestamp timeStamp) {
        this.station = station;
        this.temperature = temperature;
        this.atmPressure = atmPressure;
        this.windSpeed = windSpeed;
        this.timeStamp = timeStamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getAtmPressure() {
        return atmPressure;
    }

    public void setAtmPressure(Double atmPressure) {
        this.atmPressure = atmPressure;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
