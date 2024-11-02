package tema3;

import java.util.Date;
import java.util.List;

/**
 * @author Daniel Filip
 */

public class RaportSedinta implements Raport {
    private String motivSedinta;
    private Date data;
    private List<String> subiecteDiscutate;
    private List<String> minuta;
    private List<String> persoaneResponsabile;

    /**
     *
     * @param motivSedinta motivul sedintei
     * @param data data sedintei
     * @param subiecteDiscutate subiectele discutate in timpul sedintei
     * @param minuta consimtirea deciziilor luate in timpul sedintei
     * @param persoaneResponsabile persoanele responsabile
     */
    
    public RaportSedinta(String motivSedinta, Date data, List<String> subiecteDiscutate, List<String> minuta, List<String> persoaneResponsabile) {
        this.motivSedinta = motivSedinta;
        this.data = data;
        this.subiecteDiscutate = subiecteDiscutate;
        this.minuta = minuta;
        this.persoaneResponsabile = persoaneResponsabile;
    }

    @Override
    public String generareTitlu() {
        return "Motivul sedinsei: " + motivSedinta + "\nData: " + data + "\n";
    }

    @Override
    public String generareContinut() {
        StringBuilder continut = new StringBuilder("Subiecte discutate:\n");
        for (String subiect : subiecteDiscutate) {
            continut.append("- ").append(subiect).append("\n");
        }
        continut.append("\nMinuta sedintei:\n");
        for (String paragraf : minuta) {
            continut.append(paragraf).append("\n");
        }
        return continut.toString();
    }

    @Override
    public String generareIncheiere() {
        return "Persoane responsabile pentru intocmirea raportului:\n" + String.join(", ", persoaneResponsabile);
    }

    public Date getData() {
        return data;
    }
}
