package es.vexiza.prueba.util.exceptions;

public class InstanceNotFoundException extends Exception {

    public InstanceNotFoundException(String instanceName, Long id) {
        super("There is not a " + instanceName + " with id: " + id.toString());
    }

}
