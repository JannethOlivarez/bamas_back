package bamas.espe.ec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import bamas.espe.ec.modelos.Doctor;


public interface InterfaceDoctor extends JpaRepository<Doctor, Long> {

}
