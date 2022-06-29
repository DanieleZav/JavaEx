package school.devskill.veicoli;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import school.devskill.showroom.ShowroomUtility;

@Getter
@Setter
@NoArgsConstructor
public class Automobile extends Veicolo {
    private int cilindrata;

    public Automobile(String nome, String marca, int annoProd, double prezzo, int cilindrata) {
        super(nome, marca, annoProd, prezzo);
        this.cilindrata = cilindrata;
    }

    @Override
    public String getTipo() {
        return ShowroomUtility.TIPO_AUTOMOBILE;
    }
}
