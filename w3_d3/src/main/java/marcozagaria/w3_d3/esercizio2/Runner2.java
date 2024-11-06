package marcozagaria.w3_d3.esercizio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagina pagina1 = new Pagina(1, "Contenuto della pagina 1");
        Pagina pagina2 = new Pagina(2, "Contenuto della pagina 2");
        Pagina pagina3 = new Pagina(3, "Contenuto della pagina 3");

        Sezione sezione1 = new Sezione("Introduzione");
        sezione1.aggiungiElemento(pagina1);
        Sezione sezione2 = new Sezione("Capitolo 1");
        sezione2.aggiungiElemento(pagina2);
        Sezione sottosezione = new Sezione("Sezione 1.1");
        sottosezione.aggiungiElemento(pagina3);
        sezione2.aggiungiElemento(sottosezione);

        Libro libro = new Libro("Il mio libro", 29.99);
        libro.aggiungiAutore("Mario Rossi");
        libro.aggiungiAutore("Giulia Bianchi");
        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);

        libro.stampaLibro();
        System.out.println("Numero totale di pagine: " + libro.getNumeroTotalePagine());
    }
}
