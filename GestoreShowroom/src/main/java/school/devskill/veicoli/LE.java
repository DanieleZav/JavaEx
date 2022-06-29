package school.devskill.veicoli;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter

public class LE extends Motociclo{
    private String Edizione;

    public LE(String nome, String marca, int annoProd, double prezzo, boolean daPista, boolean edizioneLimitata) {
        super(nome, marca, annoProd, prezzo, daPista, edizioneLimitata);
    }

}
