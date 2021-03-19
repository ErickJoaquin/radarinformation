package co.mil.fac.cetad.radarinformation.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="h_radares")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HRadares {

    @Id
    int idRadar;

    int idSac;
    String latitud;
    String longitud;

}
