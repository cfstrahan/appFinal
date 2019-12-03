package com.astontech.appFinal.repositories;

import com.astontech.appFinal.domain.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
}
