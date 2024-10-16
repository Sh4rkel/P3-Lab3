package tema3;

public class Sectiune {
    private String titlu;
    private String continut;

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
