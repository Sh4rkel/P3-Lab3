package tema3;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * Clasa Main demonstreaza crearea si afișarea unui tablou de rapoarte.
 */
public class Main {
    public static void main(String[] args) {
        // Creare articole știintifice
        ArticolStintific articol1 = new ArticolStintific("Inteligența Artificială",
                Arrays.asList("Autor 1", "Autor 2"),
                Arrays.asList(new Sectiune("Introducere", "Conținut introducere"),
                        new Sectiune("Metodologie", "Conținut metodologie")),
                Arrays.asList("Referință 1", "Referință 2"));

        ArticolStintific articol2 = new ArticolStintific("Calcul cuantic",
                Arrays.asList("Autor 3"),
                Arrays.asList(new Sectiune("Prezentare generala", "Continut prezentare generala")),
                Arrays.asList("Referinta 3"));

        // Creare rapoarte de ședinta
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

        // Afisarea continutului fiecarui raport
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
            if (raport instanceof ArticolStintific) {
                count++;
            }
        }
        return count;
    }
    public static Date dataCuCeleMaiMulteSedinte(Raport[] rapoarte) {
        Map<Date, Integer> sedintePeData = new HashMap<>();
        for (Raport raport : rapoarte) {
            if (raport instanceof RaportSedinta) {
                Date data = ((RaportSedinta) raport).getData();
                sedintePeData.put(data, sedintePeData.getOrDefault(data, 0) + 1);
            }
        }

        Date dataMax = null;
        int maxSedinte = 0;
        for (Map.Entry<Date, Integer> entry : sedintePeData.entrySet()) {
            if (entry.getValue() > maxSedinte) {
                maxSedinte = entry.getValue();
                dataMax = entry.getKey();
            }
        }
        return dataMax;
    }
}

