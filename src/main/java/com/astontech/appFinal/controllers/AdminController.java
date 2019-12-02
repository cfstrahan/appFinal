package com.astontech.appFinal.controllers;


import com.astontech.appFinal.services.VehicleMakeService;
import com.astontech.appFinal.services.VehicleModelService;
import com.astontech.appFinal.services.VehicleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    @Autowired
    private VehicleMakeService vehicleMakeService;
    private VehicleService vehicleService;
    private VehicleModelService vehicleModelService;

    private Logger log = Logger.getLogger(AdminController.class);




}
