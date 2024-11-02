package tema3;

/**
 * @author Daniel Filip
 * Aceasta clasa implementeaza atat titlul cat si continut unui articol,
 */

public class Sectiune {
    private String titlu;
    private String continut;

    /**
     *
     * @param titlu titlul articolului
     * @param continut continutul articolului
     */
    
    public Sectiune(String titlu, String continut) {
        this.titlu = titlu;
        this.continut = continut;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getContinut() {
        return continut;
    }
}
