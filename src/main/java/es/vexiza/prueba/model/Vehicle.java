package es.vexiza.prueba.model;

import es.vexiza.prueba.util.enums.VehicleType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reference;

    private String name;

    private Long maxSpeed;

    private Date acquisitionDate;

    private VehicleType type;
}
