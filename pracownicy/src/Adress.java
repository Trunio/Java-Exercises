public class Adress{
private String ulica;
private int budynek;
private int lokal;
private String miasto;

public Adress(String ulica, int budynek, int lokal, String miasto){
    this.ulica=ulica;
    this.budynek=budynek;
    this.lokal=lokal;
    this.miasto=miasto;
}
    public String toString(){
    return ulica + " " + budynek + " " + lokal + " " + miasto;
    }
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getBudynek() {
        return budynek;
    }

    public void setBudynek(int budynek) {
        this.budynek = budynek;
    }

    public int getLokal() {
        return lokal;
    }

    public void setLokal(int lokal) {
        this.lokal = lokal;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }
}
