import org.junit.Assert;
import org.junit.Test;

public class PracownikTest {
    @Test
    public void PracownikGetName(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Assert.assertEquals("Maciek", biurowy.getImie());

    }
    @Test
    public void PracownikSetName(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        biurowy.setImie("Maciek1");
        Assert.assertEquals("Maciek1", biurowy.getImie());

    }
    @Test
    public void PracownikGetNazwisko(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciekkk", 30, 50, adres, 100);
        Assert.assertEquals("Maciekkk", biurowy.getNazwisko());
    }
    @Test
    public void PracownikSetNazwisko(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciekkk", 30, 50, adres, 100);
        biurowy.setNazwisko("Maciekkk1");
        Assert.assertEquals("Maciekkk1", biurowy.getNazwisko());
    }
    @Test
    public void PracownikGetWiek(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Assert.assertEquals(30, biurowy.getWiek());
    }
    @Test
    public void PracownikSetWiek(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        biurowy.setWiek(35);
        Assert.assertEquals(35,biurowy.getWiek());
    }
    @Test
    public void PracownikGetDoswiadczenie(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Assert.assertEquals(50, biurowy.getDoswiadczenie());
    }
    @Test
    public void PracownikSetDoswiadczenie(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        biurowy.setDoswiadczenie(55);
        Assert.assertEquals(55, biurowy.getDoswiadczenie());
    }
    @Test
    public void PracownikGetIdPracownik(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Worker biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Assert.assertEquals(1, biurowy.getId_pracownik());
    }
    @Test
    public void PracownikGetIq(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_biurowy biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Assert.assertEquals(100, biurowy.getIq());

    }
    @Test
    public void PracownikSetIq(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_biurowy biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        biurowy.setIq(110);
        Assert.assertEquals(110, biurowy.getIq());

    }

    @Test
    public void PracownikGetIdStanowisko(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_biurowy biurowy = new Pracownik_biurowy ("Maciek", "Maciek", 30, 50, adres, 100);
        Assert.assertEquals(1, biurowy.getId_stanowisko());

    }
    @Test
    public void PracownikGetSila(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_fizyczny robol = new Pracownik_fizyczny ("Karol", "Los", 19, 50, adres, 100);
        Assert.assertEquals(100, robol.getSila());

    }
    @Test
    public void PracownikSetSila(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_fizyczny robol = new Pracownik_fizyczny ("Karol", "Los", 19, 50, adres, 100);
        robol.setSila(40);
        Assert.assertEquals(40, robol.getSila());

    }
    @Test
    public void PracownikGetProwizja(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        Assert.assertEquals(0.8, handlarz.getProwizja(),00.1);

    }
    @Test
    public void PracownikSetProwizja(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        handlarz.setProwizja(0.6);
        Assert.assertEquals(0.6, handlarz.getProwizja(),00.1);

    }
    @Test
    public void PracownikGetSkutecznosc(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        Assert.assertEquals("NISKA", handlarz.getSkutecznosc());

    }
    @Test
    public void PracownikSetSkutecznosc(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "SREDNIA", 0.8);
        handlarz.setSkutecznosc("SREDNIA");
        Assert.assertEquals("NISKA", handlarz.getSkutecznosc());

    }
    @Test
    public void HandlarzWartoscSkutecznoscNiska(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        Assert.assertEquals(4800, handlarz.ObliczWartosc());

    }
    @Test
    public void HandlarzWartoscSkutecznoscSrednia(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "ŚREDNIA", 0.8);
        Assert.assertEquals(7200, handlarz.ObliczWartosc());

    }
    @Test
    public void HandlarzWartoscSkutecznoscWysoka(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "WYSOKA", 0.8);
        Assert.assertEquals(9600, handlarz.ObliczWartosc());

    }
    @Test
    public void PracownikFizycznyWartosc(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_fizyczny robol = new Pracownik_fizyczny("Karol", "Los", 50, 80, adres, 60);
        Assert.assertEquals(96, robol.ObliczWartosc());

    }
    @Test
    public void PracownikBiurowyWartosc(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_biurowy korpo = new Pracownik_biurowy("Karol", "Los", 50, 80, adres, 100);
        Assert.assertEquals(8000, korpo.ObliczWartosc());
    }
    @Test
    public void PracownikBiurowytoString(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_biurowy korpo = new Pracownik_biurowy("Karol", "Los", 50, 80, adres, 100);
        Assert.assertEquals("Id: 1\n" +
                "Imie: Karol\n" +
                "Nazwisko: Los\n" +
                "Wiek: 50\n" +
                "Doswiadczenie: 80\n" +
                "Adres: Jagodowa 31 10 Gdansk\n" +
                "Id Stanowiska: 1\n" +
                "Iq: 100", korpo.toString());
    }
    @Test
    public void PracownikFizycznytoString(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Pracownik_fizyczny robol = new Pracownik_fizyczny("Karol", "Los", 50, 80, adres, 60);
        Assert.assertEquals("Id: 1\n" +
                "Imie: Karol\n" +
                "Nazwisko: Los\n" +
                "Wiek: 50\n" +
                "Doswiadczenie: 80\n" +
                "Adres: Jagodowa 31 10 Gdansk\n" +
                "Sila fizyczna: 60", robol.toString());
    }
    @Test
    public void HandlarztoString(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Handlarz handlarz = new Handlarz("Karol", "Los", 50, 80, adres, "NISKA", 0.8);
        Assert.assertEquals("Id: 1\n" +
                "Imie: Karol\n" +
                "Nazwisko: Los\n" +
                "Wiek: 50\n" +
                "Doswiadczenie: 80\n" +
                "Adres: Jagodowa 31 10 Gdansk\n" +
                "Skutecznosc: NISKA\n" +
                "Prowizja: 80%", handlarz.toString());
    }

}
