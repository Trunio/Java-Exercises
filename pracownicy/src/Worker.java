import org.jetbrains.annotations.Contract;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Worker {
    public static int id_pracownik_numer=1;
    public int id_pracownik=1;
    public String imie;
    public String nazwisko;
    public int wiek;
    public int doswiadczenie;
    public Adress adres;

    public Worker(String imie, String nazwisko, int wiek, int doswiadczenie, Adress adress) {
        this.id_pracownik=id_pracownik_numer;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
        this.doswiadczenie=doswiadczenie;
        this.adres=adress;
    };

    protected abstract int ObliczWartosc();

    public abstract String toString();
/*
    public static Comparator<Worker> WorkerDoswiadczenie = new Comparator<Worker>(){
        public int compare(Worker s1, Worker s2){
            int dosw1 = s1.getDoswiadczenie();
            int dosw2 = s2.getDoswiadczenie();
            return dosw2-dosw1;
        }
    };
    public static Comparator<Worker> WorkerWiek = new Comparator<Worker>(){
        public int compare(Worker s1, Worker s2){
            int dosw1 = s1.getWiek();
            int dosw2 = s2.getWiek();
            return dosw1-dosw2;
        }
    };
    public static Comparator<Worker> WorkerNazwisko = new Comparator<Worker>(){
        public int compare(Worker s1, Worker s2){
            String dosw1 = s1.getNazwisko();
            String dosw2 = s2.getNazwisko();
            return dosw1.compareTo(dosw2);
        }
    };
*/


    public int getId_pracownik() {
        return id_pracownik;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }

}