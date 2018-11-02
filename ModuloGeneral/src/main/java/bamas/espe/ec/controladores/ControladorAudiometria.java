package bamas.espe.ec.controladores;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bamas.espe.ec.interfaces.InterfaceAudiometria;
import bamas.espe.ec.modelos.Audiometria;

@Controller
@RequestMapping("/audiometria")
public class ControladorAudiometria extends AbstracControlador<InterfaceAudiometria,Audiometria> {

}
