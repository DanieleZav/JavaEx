package school.devskill;

import school.devskill.showroom.ShowRoom;
import school.devskill.veicoli.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShowRoom showRoom = new ShowRoom();
        InserisciVeicoli(showRoom);

        System.out.println(showRoom.CalcoloPrezzoMedio());
        System.out.println(showRoom.CalcoloPrezzoMedioPerTipo("Automobile"));
        System.out.println(showRoom.CalcoloPrezzoMedioPerTipo("Motociclo"));
        System.out.println(showRoom.piuVecchio());
        System.out.println(showRoom.piuNuovo());

    }


    private static void InserisciVeicoli(ShowRoom showRoom) {
        List<Veicolo> daInserire = new ArrayList<>();

        List<String> gomme = new ArrayList<>(Arrays.asList("Morbide", "Medie", "Dure"));
        List<String> marche = new ArrayList<>(Arrays.asList("Fiat", "Mercedes", "Mv Agusta", "Ferrari", "BMW", "Yamaha"));
        List<String> nomi = new ArrayList<>(Arrays.asList("Punto", "Classe A", "Brutale", "Testarosse", "M3", "Tracer"));
        List<Integer> annoProd = new ArrayList<>(Arrays.asList(2000, 2017, 2022, 1989, 1995, 2010));
        List<Double> prezzo = new ArrayList<>(Arrays.asList(10000.32, 14200.32, 40000.32, 60301.00, 100000.32, 8000.00));
        List<Integer> cilindrate = new ArrayList<>(Arrays.asList(1000, 1600, 0, 3000, 1900, 0));

        for (int i = 0; i < marche.size(); i++) {

            Veicolo veicolo;
            DaPista copertoni;

            if (i == 2 || i == 5) {
                Motociclo moto = new Motociclo(nomi.get(i), marche.get(i), annoProd.get(i), prezzo.get(i));
                if (i == 2) {
                    moto.setDaPista(true);
                } else {
                    moto.setEdizioneLimitata(true);
                }
                veicolo = moto;

                if (moto.getDaPista()) {
                    DaPista mescola = new DaPista(gomme.get(i));

                    switch (i) {
                        case 1 -> moto.setGomme(gomme.get(0));
                        case 2 -> moto.setGomme(gomme.get(1));
                        case 3 -> moto.setGomme(gomme.get(2));
                    }
                } else {

                    veicolo = new Automobile(nomi.get(i), marche.get(i), annoProd.get(i), prezzo.get(i), cilindrate.get(i));

                }

                daInserire.add(veicolo);
            }
            showRoom.aggiungiVeicoli(daInserire);
        }
    }
}
