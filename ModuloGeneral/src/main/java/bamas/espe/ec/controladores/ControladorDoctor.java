package bamas.espe.ec.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceDoctor;
import bamas.espe.ec.modelos.Doctor;

@Controller
@RequestMapping("/doctor")
public class ControladorDoctor extends AbstracControlador<InterfaceDoctor, Doctor>  {

}
