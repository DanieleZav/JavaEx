package school.devskill.veicoli;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DaPista extends Motociclo{

    private boolean cambio;
    private String gomme;

    public DaPista(String nome, String marca, int annoProd, double prezzo, boolean daPista, boolean edizioneLimitata, boolean cambio, String gomme) {
        super(nome, marca, annoProd, prezzo, daPista, edizioneLimitata);
        this.cambio = cambio;
        this.gomme = gomme;
    }


    public DaPista(String s) {

    }
}
