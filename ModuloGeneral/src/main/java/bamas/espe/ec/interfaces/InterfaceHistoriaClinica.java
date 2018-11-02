package bamas.espe.ec.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;

import bamas.espe.ec.modelos.HistoriaClinica;

public interface InterfaceHistoriaClinica extends JpaRepository<HistoriaClinica,Long> {

}
