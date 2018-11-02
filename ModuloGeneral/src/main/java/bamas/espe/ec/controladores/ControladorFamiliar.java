package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceFamiliar;
import bamas.espe.ec.modelos.RelacionFamilia;
@Controller
@RequestMapping("/familia")
public class ControladorFamiliar  extends AbstracControlador<InterfaceFamiliar,RelacionFamilia> {

}
