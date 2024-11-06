package marcozagaria.w3_d3.esercizio2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Libro {
    private String titolo;
    private List<String> autori = new ArrayList<>();
    private double prezzo;
    private List<ElementoLibro> elementi = new ArrayList<>();

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    public int getNumeroTotalePagine() {
        int numeroPagine = 0;
        for (ElementoLibro elemento : elementi) {
            numeroPagine += elemento.getNumeroPagine();
        }
        return numeroPagine;
    }

    public void stampaLibro() {
        System.out.println("Libro: " + titolo);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Autori: " + String.join(", ", autori));
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
    }
}
