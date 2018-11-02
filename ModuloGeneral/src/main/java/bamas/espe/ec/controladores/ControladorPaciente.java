package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfacePaciente;
import bamas.espe.ec.modelos.Paciente;

@Controller
@RequestMapping("/paciente")
public class ControladorPaciente  extends AbstracControlador<InterfacePaciente,Paciente> {

}
