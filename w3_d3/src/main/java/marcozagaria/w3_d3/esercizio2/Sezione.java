package marcozagaria.w3_d3.esercizio2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Sezione implements ElementoLibro {
    private String titolo;
    private List<ElementoLibro> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (ElementoLibro elemento : elementi) {
            numeroPagine += elemento.getNumeroPagine();

        }
        return numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
    }
}
