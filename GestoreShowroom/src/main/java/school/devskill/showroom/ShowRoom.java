package school.devskill.showroom;


import lombok.Getter;
import lombok.Setter;
import school.devskill.veicoli.Automobile;
import school.devskill.veicoli.Motociclo;
import school.devskill.veicoli.Veicolo;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ShowRoom {
    private List<Veicolo> veicoli;

    public ShowRoom() {
        veicoli = new ArrayList<>();
    }


    public Veicolo piuVecchio() {
        Veicolo daTornare = null;
        int min = veicoli.get(0).getAnnoProd();

        for (int i = 0; i < veicoli.size(); i++) {
            int annoCorrente = veicoli.get(i).getAnnoProd();

            if (annoCorrente < min) {
                min = annoCorrente;
                daTornare = veicoli.get(i);
            }
        }
        return daTornare == null ? veicoli.get(0) : daTornare;
    }


    public Veicolo piuNuovo() {
        Veicolo daTornare = null;
        int max = veicoli.get(0).getAnnoProd();

        for (int i = 0; i < veicoli.size(); i++) {
            int annoCorrente = veicoli.get(i).getAnnoProd();

            if (annoCorrente > max) {
                max = annoCorrente;
                daTornare = veicoli.get(i);
            }
        }
        return daTornare == null ? veicoli.get(0) : daTornare;
    }


    //La media è data dalla somma di tutti i prezzi dei veicolo / il numero totale dei veicoli
    public double CalcoloPrezzoMedio() {

        double totalePrezzi = 0;

        for (int i = 0; i < veicoli.size(); i++) {
            totalePrezzi += veicoli.get(i).getPrezzo();
        }

        return totalePrezzi / veicoli.size();

    }


    //La media è data dalla somma di tutti i prezzi dei veicolo / il numero totale dei veicoli
    public double CalcoloPrezzoMedioPerTipo(String tipo) {

        double totalePrezzi = 0;
        int totaleVeicoli = 0;

        for (int i = 0; i < veicoli.size(); i++) {

            Veicolo v = veicoli.get(i);

            if (v.getTipo().equals(tipo)) {
                totalePrezzi += v.getPrezzo();
                totaleVeicoli++;
            }

        }

        return totaleVeicoli == 0 ? 0 : totalePrezzi / totaleVeicoli;

    }


    public void aggiungiVeicoli(List<Veicolo> daAggiungere) {
        veicoli.addAll(daAggiungere);
    }

    public void rimuoviVeicoli(List<Veicolo> daRimuovere) {
        veicoli.removeAll(daRimuovere);
    }

    public void aggingiVeicolo(Veicolo v) {
        veicoli.add(v);
    }

    public void rimuoviVeicolo(Veicolo v) {
        veicoli.remove(v);
    }
}
