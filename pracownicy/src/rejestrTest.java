import org.junit.*;

import java.util.ArrayList;

public class rejestrTest {
    @Test
    public void addTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        ArrayList<Worker> lista = new ArrayList<>();
        lista.add(handlarz);
        rejestr.addPracownik(handlarz);
        Assert.assertEquals(lista, rejestr.getRejestr());
    }
    @Test
    public void removeTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        ArrayList<Worker> lista = new ArrayList<>();
        lista.add(handlarz);
        rejestr.addPracownik(handlarz);
        rejestr.addPracownik(handlarz);
        rejestr.removePracownik(1);
        Assert.assertEquals(lista, rejestr.getRejestr());
    }
    @Test
    public void addmultipleTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        ArrayList<Worker> lista = new ArrayList<>();
        lista.add(handlarz);
        lista.add(handlarz);
        lista.add(biurowy);
        rejestr.addMultiplePracownik(handlarz,handlarz,biurowy);
        Assert.assertEquals(lista, rejestr.getRejestr());
    }
    @Test
    public void miastoTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Adress adres2 = new Adress ("Jagodowa",31,10,"Gdynia");
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres2, "NISKA", 0.8);
        Worker handlarz2 = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        rejestr rejestr = new rejestr();
        rejestr.addMultiplePracownik(handlarz,handlarz2,biurowy);
        rejestr.miastoPracownika("Gdansk");
    }
    @Test
    public void toStringTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        ArrayList<Worker> lista = new ArrayList<>();
        lista.add(handlarz);
        rejestr.addPracownik(handlarz);
        Assert.assertEquals("Id: 1\n" +
                "Imie: Karol\n" +
                "Nazwisko: Los\n" +
                "Wiek: 50\n" +
                "Doswiadczenie: 80\n" +
                "Adres: Jagodowa 31 10 Gdansk\n" +
                "Skutecznosc: NISKA\n" +
                "Prowizja: 80%", rejestr.toString());
    }
    @Test
    public void wyswietlTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        rejestr.addPracownik(handlarz);
        rejestr.Wyswietl();
    }
    @Test
    public void getRejestrTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        ArrayList<Worker> lista = new ArrayList<>();
        lista.add(handlarz);
        rejestr.addPracownik(handlarz);
        Assert.assertEquals(lista, rejestr.getRejestr());
    }
    @Test
    public void sortTEST(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Worker handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        rejestr rejestr = new rejestr();
        ArrayList<Worker> lista = new ArrayList<>();
        lista.add(handlarz);
        lista.add(handlarz);
        lista.add(biurowy);
        rejestr.addMultiplePracownik(biurowy,handlarz,handlarz);
        rejestr.Sortuj();
        Assert.assertEquals(lista, rejestr.getRejestr());
    }

}
