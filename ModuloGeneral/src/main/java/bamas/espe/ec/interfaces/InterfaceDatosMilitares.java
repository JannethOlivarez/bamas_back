package bamas.espe.ec.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;

import bamas.espe.ec.modelos.Militar;

public interface InterfaceDatosMilitares extends JpaRepository<Militar,Long> {

}
