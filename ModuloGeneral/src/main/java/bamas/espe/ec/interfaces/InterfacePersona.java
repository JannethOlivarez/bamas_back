package bamas.espe.ec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import bamas.espe.ec.modelos.Persona;

public interface InterfacePersona extends JpaRepository<Persona, Long> {

}
