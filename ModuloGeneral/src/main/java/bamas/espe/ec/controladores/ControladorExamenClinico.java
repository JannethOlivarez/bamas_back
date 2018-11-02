package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceExamenClinico;
import bamas.espe.ec.modelos.ExamenClinico;
@Controller
@RequestMapping("/examenclinico")
public class ControladorExamenClinico extends AbstracControlador<InterfaceExamenClinico,ExamenClinico> {

}
