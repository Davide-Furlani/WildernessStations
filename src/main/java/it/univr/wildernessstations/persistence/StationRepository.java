package it.univr.wildernessstations.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StationRepository extends CrudRepository<Station, Long> {
    Station findById(long id);
    List<Station> findAll();
}
