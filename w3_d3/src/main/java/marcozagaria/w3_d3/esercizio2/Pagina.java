package marcozagaria.w3_d3.esercizio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pagina implements ElementoLibro {
    private int numeroPagina;
    private String contenuto;

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina " + numeroPagina + ": " + contenuto);
    }
}
