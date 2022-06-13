package es.vexiza.prueba.service;

import es.vexiza.prueba.dao.VehicleDao;
import es.vexiza.prueba.dto.VehicleDTO;
import es.vexiza.prueba.dto.VehicleResponseDTO;
import es.vexiza.prueba.util.enums.VehicleType;
import es.vexiza.prueba.service.interfaces.VehicleService;
import es.vexiza.prueba.util.exceptions.InstanceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import static es.vexiza.prueba.adapter.VehicleAdapter.toVehicleDTO;
import static es.vexiza.prueba.adapter.VehicleAdapter.toVehicleResponseDTO;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleDao vehicleDao;

    @Override
    public VehicleDTO findVehicle(Long id) throws InstanceNotFoundException {
        return toVehicleDTO(vehicleDao.findById(id).orElseThrow(
                () -> new InstanceNotFoundException("vehicle", id)));
    }

    @Override
    public VehicleResponseDTO findAllVehiclesPageable(int page, int size) {
        return toVehicleResponseDTO(vehicleDao.findAll(PageRequest.of(page,
                size))
        );
    }

    @Override
    public VehicleResponseDTO findVehiclesByTypePageable(
            String type, int page, int size) {
        return toVehicleResponseDTO(vehicleDao.findAllByType(
                VehicleType.valueOf(type), PageRequest.of(page, size))
        );
    }
}
