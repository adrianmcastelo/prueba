package es.vexiza.prueba.adapter;

import es.vexiza.prueba.dto.VehicleDTO;
import es.vexiza.prueba.dto.VehicleResponseDTO;
import es.vexiza.prueba.model.Vehicle;
import org.springframework.data.domain.Slice;

import java.util.stream.Collectors;

public class VehicleAdapter {

    public static VehicleDTO toVehicleDTO(Vehicle vehicle) {
        return new VehicleDTO(
                vehicle.getId(),
                vehicle.getReference(),
                vehicle.getName(),
                vehicle.getMaxSpeed(),
                vehicle.getAcquisitionDate(),
                vehicle.getType().toString()
        );
    }

    public static VehicleResponseDTO toVehicleResponseDTO(Slice<Vehicle> vehicles) {
        return new VehicleResponseDTO(
                vehicles.getContent().stream().map(VehicleAdapter::toVehicleDTO)
                        .collect(Collectors.toList()),
                vehicles.getNumberOfElements()
        );
    }
}
