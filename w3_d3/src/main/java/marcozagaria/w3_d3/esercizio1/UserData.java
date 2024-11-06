package marcozagaria.w3_d3.esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int età;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        età = ds.getEtà();
    }
    
}
