package marcozagaria.w3_d3.esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Info {
    private String nome;
    private String congnome;
    private Date dataDiNascita;

}
