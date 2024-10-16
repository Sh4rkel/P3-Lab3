package tema3;

import java.util.List;

public class ArticolStiintific implements Raport {
    private String titlu;
    private List<String> autori;
    private List<Sectiune> sectiuni;
    private List<String> bibliografie;

    public ArticolStiintific(String titlu, List<String> autori, List<Sectiune> sectiuni, List<String> bibliografie) {
        this.titlu = titlu;
        this.autori = autori;
        this.sectiuni = sectiuni;
        this.bibliografie = bibliografie;
    }

    @Override
    public String generareTitlu() {
        return "Titlu: " + titlu + "\nAutori: " + String.join(", ", autori) + "\n";
    }

    @Override
    public String generareContinut() {
        StringBuilder continut = new StringBuilder();
        for (Sectiune sectiune : sectiuni) {
            continut.append("Secțiune: ").append(sectiune.getTitlu()).append("\n")
                    .append(sectiune.getContinut()).append("\n");
        }
        return continut.toString();
    }

    @Override
    public String generareIncheiere() {
        return "Bibliografie:\n" + String.join("\n", bibliografie);
    }
}
