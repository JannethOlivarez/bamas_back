package bamas.espe.ec.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfacePersona;
import bamas.espe.ec.modelos.Persona;

@Controller
@RequestMapping("/civil")
public class ControladorPersona extends AbstracControlador<InterfacePersona, Persona> {

}
