import java.util.concurrent.atomic.AtomicInteger;

class Pracownik_biurowy extends Worker{
    public static int id_stanowisko_numer=1;
    private int id_stanowisko = 1;
    private int iq;

    Pracownik_biurowy(String imie, String nazwisko, int wiek, int doswiadczenie, Adress adress, int iq){
        super(imie, nazwisko, wiek, doswiadczenie, adress);
        if(iq<70 || iq>150){
            throw new IllegalArgumentException("Intelekt musi byc w granicach [70-150]");
        }
        this.iq=iq;
        this.id_stanowisko=id_stanowisko_numer;
        id_stanowisko_numer++;
    }

    @Override
    protected int ObliczWartosc() {
    return this.doswiadczenie*this.iq;
    }

    @Override
    public String toString() {
        return  "Id: " + id_pracownik + '\n'
                + "Imie: " + imie  + '\n'
                + "Nazwisko: " + nazwisko  + '\n'
                + "Wiek: " + wiek + '\n'
                + "Doswiadczenie: " + doswiadczenie + '\n'
                + "Adres: " + adres  + '\n'
                + "Id Stanowiska: " + id_stanowisko + '\n'
                + "Iq: " + iq ;
    }

    public int getId_stanowisko() {
        return id_stanowisko;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
class Pracownik_fizyczny extends Worker{
    private int sila;

    Pracownik_fizyczny(String imie, String nazwisko, int wiek, int doswiadczenie, Adress adress, int sila){
        super(imie, nazwisko, wiek, doswiadczenie, adress);
        if(sila<1 || sila>100){
            throw new IllegalArgumentException("Sila musi byc w granicach [1-100]");
        }
        this.sila=sila;
        id_pracownik_numer++;
    }

    @Override
    protected int ObliczWartosc() {
    return (this.doswiadczenie*this.sila)/this.wiek;
    }

    @Override
    public String toString() {
       return  "Id: " + id_pracownik + '\n'
                + "Imie: " + imie  + '\n'
                + "Nazwisko: " + nazwisko  + '\n'
                + "Wiek: " + wiek + '\n'
                + "Doswiadczenie: " + doswiadczenie + '\n'
                + "Adres: " + adres  + '\n'
                + "Sila fizyczna: " + sila;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }
}
class Handlarz extends Worker{
    private String skutecznosc;
    private double prowizja;
    Handlarz(String imie, String nazwisko, int wiek, int doswiadczenie, Adress adress, String skutecznosc, double prowizja){
        super(imie, nazwisko, wiek, doswiadczenie, adress);
        this.skutecznosc=skutecznosc;
        this.prowizja=prowizja;
        id_pracownik_numer++;
    }
    @Override
    protected int ObliczWartosc() {
        int liczba = 0;
        if(this.skutecznosc.equals("NISKA")){
            liczba=60;
        }
        if(this.skutecznosc.equals("ŚREDNIA")){
            liczba=90;
        }
        if(this.skutecznosc.equals("WYSOKA")){
            liczba=120;
        }
        return this.doswiadczenie*liczba;
    }

    @Override
    public String toString() {
        return  "Id: " + id_pracownik + '\n'
                + "Imie: " + imie  + '\n'
                + "Nazwisko: " + nazwisko  + '\n'
                + "Wiek: " + wiek + '\n'
                + "Doswiadczenie: " + doswiadczenie + '\n'
                + "Adres: " + adres  + '\n'
                + "Skutecznosc: " + skutecznosc + '\n'
                + "Prowizja: " + (int)(prowizja*100) + "%";

    }

    public String getSkutecznosc() {
        return skutecznosc;
    }

    public void setSkutecznosc(String skutecznosc) {
        this.skutecznosc = skutecznosc;
    }

    public double getProwizja() {
        return prowizja;
    }

    public void setProwizja(double prowizja) {
        this.prowizja = prowizja;
    }
}
