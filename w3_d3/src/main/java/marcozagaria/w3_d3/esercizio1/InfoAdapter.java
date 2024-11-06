package marcozagaria.w3_d3.esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class InfoAdapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCongnome();
    }

    @Override
    public int getEtà() {
        LocalDate dataDiNascita = convertToLocalDate(info.getDataDiNascita());
        LocalDate oggi = LocalDate.now();
        return Period.between(dataDiNascita, oggi).getYears();
    }

    private LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    }
}
