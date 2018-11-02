package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceRem;
import bamas.espe.ec.modelos.Rem;

@Controller
@RequestMapping("/rem")
public class ControladorRem  extends AbstracControlador<InterfaceRem,Rem>{

}
