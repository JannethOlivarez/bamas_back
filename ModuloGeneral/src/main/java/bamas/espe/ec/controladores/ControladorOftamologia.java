package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceOftamologia;
import bamas.espe.ec.modelos.Oftamologia;
@Controller
@RequestMapping("/oftamologia")
public class ControladorOftamologia  extends AbstracControlador<InterfaceOftamologia,Oftamologia>{

}
