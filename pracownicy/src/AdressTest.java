import org.junit.*;
public class AdressTest {
    @Test
    public void AdressGetUlica(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Assert.assertEquals("Jagodowa", adres.getUlica());
    }
    @Test
    public void AdressGetBudynek(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Assert.assertEquals(31, adres.getBudynek());
    }
    @Test
    public void AdressGetLokal(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Assert.assertEquals(10, adres.getLokal());
    }
    @Test
    public void AdressGetMiasto(){
        Adress adres = new Adress ("Jagodowa",31,10,"Gdansk");
        Assert.assertEquals("Gdansk", adres.getMiasto());
    }
    @Test
    public void AdressSetUlica(){
        Adress adres = new Adress ("Poziomkowa",11,50,"Warszawa");
        adres.setUlica("Jagodowa");
        Assert.assertEquals("Jagodowa", adres.getUlica());
    }
    @Test
    public void AdressSetBudynek(){
        Adress adres = new Adress ("Poziomkowa",11,50,"Warszawa");
        adres.setBudynek(31);
        Assert.assertEquals(31, adres.getBudynek());
    }
    @Test
    public void AdressSetLokal(){
        Adress adres = new Adress ("Poziomkowa",11,50,"Warszawa");
        adres.setLokal(10);
        Assert.assertEquals(10, adres.getLokal());
    }
    @Test
    public void AdressSetMiasto(){
        Adress adres = new Adress ("Poziomkowa",11,50,"Warszawa");
        adres.setMiasto("Gdansk");
        Assert.assertEquals("Gdansk", adres.getMiasto());
    }
}
