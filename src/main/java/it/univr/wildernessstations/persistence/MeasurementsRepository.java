package it.univr.wildernessstations.persistence;

import org.springframework.data.repository.CrudRepository;

public interface MeasurementsRepository extends CrudRepository<Measurements, Long> {
    Measurements findById(long id);
}
