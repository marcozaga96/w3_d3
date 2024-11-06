package marcozagaria.w3_d3.esercizio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info info = new Info("Marco", "Zagaria", new Date(96, 12, 10));
        DataSource adapter = new InfoAdapter(info);
        UserData userData = new UserData(adapter.getNomeCompleto(), adapter.getEtà());
        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEtà());
    }

}
