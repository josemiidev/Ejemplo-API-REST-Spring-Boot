package dev.josemii.api_rest_ejemplo.Modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartamentosDAO extends CrudRepository<DepartamentosClass, Integer> {
}