package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceHistoriaClinica;
import bamas.espe.ec.modelos.HistoriaClinica;
@Controller
@RequestMapping("/historiaClinica")
public class ControladorHistoriaClinica  extends AbstracControlador<InterfaceHistoriaClinica,HistoriaClinica> {

}
