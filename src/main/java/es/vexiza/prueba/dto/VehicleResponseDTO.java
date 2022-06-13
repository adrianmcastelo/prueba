package es.vexiza.prueba.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class VehicleResponseDTO {

    private List<VehicleDTO> vehicles;

    private int numberOfElements;

    public VehicleResponseDTO() {
    }

    public VehicleResponseDTO(List<VehicleDTO> vehicles, int numberOfElements) {
        this.vehicles = vehicles;
        this.numberOfElements = numberOfElements;
    }
}
