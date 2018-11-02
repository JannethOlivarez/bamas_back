package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceLaboratorio;
import bamas.espe.ec.modelos.Laboratorio;

@Controller
@RequestMapping("/laboratorio")
public class ControladorLaboratorio  extends AbstracControlador<InterfaceLaboratorio,Laboratorio>{

}
