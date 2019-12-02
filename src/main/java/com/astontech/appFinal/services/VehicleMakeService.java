package com.astontech.appFinal.services;

import com.astontech.appFinal.domain.VehicleMake;

public interface VehicleMakeService {
    Iterable<VehicleMake> listAllVehicleMakes();

    VehicleMake getVehicleMakeById(Integer id);

    VehicleMake saveVehicleMake(VehicleMake vehicleMake);

    Iterable<VehicleMake> saveVehicleMakeList(Iterable<VehicleMake> vehicleMakeIterable);

    void deleteVehicleMake(Integer id);
}
