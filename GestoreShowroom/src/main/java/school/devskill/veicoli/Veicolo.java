package school.devskill.veicoli;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Veicolo{
    protected String nome;
    protected String marca;
    protected int annoProd;
    protected double prezzo;

    public abstract String getTipo();

}
