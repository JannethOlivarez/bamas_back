package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceEnfermeria;
import bamas.espe.ec.modelos.Enfermeria;

@Controller
@RequestMapping("/enfermeria")
public class ControladorEnfermería extends AbstracControlador<InterfaceEnfermeria,Enfermeria> {

}
