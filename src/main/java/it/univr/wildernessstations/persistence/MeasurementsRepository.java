package it.univr.wildernessstations.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MeasurementsRepository extends CrudRepository<Measurements, Long> {
    Measurements findById(long id);
    List<Measurements> findMeasurementsByStation (Station station);
}
