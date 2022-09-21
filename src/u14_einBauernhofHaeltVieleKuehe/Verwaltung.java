package u14_einBauernhofHaeltVieleKuehe;

import util.Eingabe;

public class Verwaltung {

    public static void main(String[] args) {
        String name = Eingabe.readString("Bauernhof: ");
        int anzahl = Eingabe.readInt("Maximale Kuehe: ");

        Bauernhof bauernhof = new Bauernhof(name, anzahl);

        for(int i = 1; i <= anzahl; i++) {
            String kuhName = Eingabe.readString("Kuh " + i + " Name: ");
            int alter = Eingabe.readInt("Kuh " + i + " Alter: ");
            int gewicht = Eingabe.readInt("Kuh " + i + " Gewicht: ");
            bauernhof.addKuh(new MilchKuh(kuhName, alter, gewicht));
        }

        bauernhof.kueheAuflisten();
    }
}
