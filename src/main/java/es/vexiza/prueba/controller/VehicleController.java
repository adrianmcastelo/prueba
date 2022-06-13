package es.vexiza.prueba.controller;

import es.vexiza.prueba.dto.VehicleDTO;
import es.vexiza.prueba.dto.VehicleResponseDTO;
import es.vexiza.prueba.service.interfaces.VehicleService;
import es.vexiza.prueba.util.exceptions.InstanceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("{id}")
    public VehicleDTO findVehicle(@PathVariable("id") Long id )
            throws InstanceNotFoundException {
        return vehicleService.findVehicle(id);
    }

    @GetMapping("")
    public VehicleResponseDTO findVehiclesPageable(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return vehicleService.findAllVehiclesPageable(page, size);
    }

    @GetMapping("")
    public VehicleResponseDTO findVehiclesByTypePageable(
            @RequestParam(defaultValue = "") String type,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return vehicleService.findVehiclesByTypePageable(type, page, size);
    }
}
