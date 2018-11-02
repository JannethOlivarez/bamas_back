package bamas.espe.ec.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;

import bamas.espe.ec.modelos.Paciente;

public interface InterfacePaciente extends JpaRepository<Paciente, Long>{

}
