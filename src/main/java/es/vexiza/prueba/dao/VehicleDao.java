package es.vexiza.prueba.dao;

import es.vexiza.prueba.model.Vehicle;
import es.vexiza.prueba.util.enums.VehicleType;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleDao extends PagingAndSortingRepository<Vehicle, Long> {

    Optional<Vehicle> findById(Long id);

    Slice<Vehicle> findAllByType(VehicleType type, Pageable pageable);

}
