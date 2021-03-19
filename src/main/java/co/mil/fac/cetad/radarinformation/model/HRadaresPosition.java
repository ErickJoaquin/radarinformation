package co.mil.fac.cetad.radarinformation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.bytebuddy.asm.Advice;

@Data
@AllArgsConstructor

public class HRadaresPosition extends  HRadares {


    private int idRadar;
    private  String direccionamiento;
    private  String descripcionRadar;
    private  String  cabezeraRadar;










}
