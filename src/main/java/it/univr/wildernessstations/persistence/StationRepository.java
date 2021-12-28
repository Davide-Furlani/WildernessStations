package it.univr.wildernessstations.persistence;

import org.springframework.data.repository.CrudRepository;

public interface StationRepository extends CrudRepository<Station, Long> {
    Station findById(long id);
}
