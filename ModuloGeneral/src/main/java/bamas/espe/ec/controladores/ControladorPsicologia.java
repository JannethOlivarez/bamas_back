package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfacePsicologia;
import bamas.espe.ec.modelos.Psicologia;

@Controller
@RequestMapping("/psicologia")
public class ControladorPsicologia  extends AbstracControlador<InterfacePsicologia,Psicologia>{

}


