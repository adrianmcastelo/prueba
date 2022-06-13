package es.vexiza.prueba.service.interfaces;

import es.vexiza.prueba.dto.VehicleDTO;
import es.vexiza.prueba.dto.VehicleResponseDTO;
import es.vexiza.prueba.util.enums.VehicleType;
import es.vexiza.prueba.util.exceptions.InstanceNotFoundException;

public interface VehicleService  {

    VehicleDTO findVehicle(Long id) throws InstanceNotFoundException;

    VehicleResponseDTO findAllVehiclesPageable(int page, int size);

    VehicleResponseDTO findVehiclesByTypePageable(String type, int page, int size);

}
