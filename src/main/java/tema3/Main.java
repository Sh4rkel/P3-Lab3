package tema3;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Clasa Main demonstrează crearea și afișarea unui tablou de rapoarte.
 */
public class Main {
    public static void main(String[] args) {
        // Creare articole științifice
        ArticolStiintific articol1 = new ArticolStiintific("Inteligența Artificială",
                Arrays.asList("Autor 1", "Autor 2"),
                Arrays.asList(new Sectiune("Introducere", "Conținut introducere"),
                        new Sectiune("Metodologie", "Conținut metodologie")),
                Arrays.asList("Referință 1", "Referință 2"));

        ArticolStiintific articol2 = new ArticolStiintific("Calcul cuantic",
                Arrays.asList("Autor 3"),
                Arrays.asList(new Sectiune("Prezentare generală", "Conținut prezentare generală")),
                Arrays.asList("Referință 3"));

        // Creare rapoarte de ședință
        RaportSedinta raport1 = new RaportSedinta("Discutarea obiectivelor trimestriale",
                new Date(),
                Arrays.asList("Subiect 1", "Subiect 2"),
                Arrays.asList("Paragraf 1", "Paragraf 2"),
                Arrays.asList("Persoana 1", "Persoana 2"));

        RaportSedinta raport2 = new RaportSedinta("Planificarea resurselor",
                new Date(),
                Arrays.asList("Subiect A", "Subiect B"),
                Arrays.asList("Paragraf A", "Paragraf B"),
                Arrays.asList("Persoana A", "Persoana B"));

        // Tablou de rapoarte
        Raport[] rapoarte = {articol1, articol2, raport1, raport2};

        // Afișarea conținutului fiecărui raport
        for (Raport raport : rapoarte) {
            System.out.println(raport.generareTitlu());
            System.out.println(raport.generareContinut());
            System.out.println(raport.generareIncheiere());
            System.out.println("------------------------------------------------------");
        }
    }
    public static int numarArticole(Raport[] rapoarte) {
        int count = 0;
        for (Raport raport : rapoarte) {
            if (raport instanceof ArticolStiintific) {
                count++;
            }
        }
        return count;
    }
}

