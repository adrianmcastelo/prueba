package es.vexiza.prueba.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class VehicleDTO {

    private Long id;

    private String reference;

    private String name;

    private Long maxSpeed;

    private Date acquisitionDate;

    private String type;

    public VehicleDTO() {
    }

    public VehicleDTO(Long id, String reference, String name, Long maxSpeed,
                      Date acquisitionDate, String type) {
        this.id = id;
        this.reference = reference;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.acquisitionDate = acquisitionDate;
        this.type = type;
    }
}
