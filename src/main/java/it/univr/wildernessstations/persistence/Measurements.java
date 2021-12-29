package it.univr.wildernessstations.persistence;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Measurements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Station station;
    private double temperature;
    private double atmPressure;
    private double windSpeed;
    private Timestamp timeStamp;

    public Measurements(){
    }

    public Measurements(Station station, double temperature, double atmPressure, double windSpeed, Timestamp timeStamp) {
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

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getAtmPressure() {
        return atmPressure;
    }

    public void setAtmPressure(double atmPressure) {
        this.atmPressure = atmPressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
