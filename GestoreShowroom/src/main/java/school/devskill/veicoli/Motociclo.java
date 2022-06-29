package school.devskill.veicoli;

import lombok.*;
import school.devskill.showroom.ShowroomUtility;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Motociclo extends Veicolo {
    private boolean daPista = false;
    private boolean edizioneLimitata = false;

    public Motociclo(String nome, String marca, int annoProd, double prezzo, boolean daPista, boolean edizioneLimitata) {
        super(nome, marca, annoProd, prezzo);
        this.daPista = daPista;
        this.edizioneLimitata = edizioneLimitata;
    }

    public Motociclo(String nome, String marca, int annoProd, double prezzo) {
        super(nome, marca, annoProd, prezzo);
    }

    @Override
    public String getTipo() {
        return ShowroomUtility.TIPO_MOTOCICLO;
    }

    public boolean getDaPista() {
        return false;
    }

    public void setGomme(String s) {
    }
}
