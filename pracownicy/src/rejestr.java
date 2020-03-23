import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class rejestr extends ComperatorWorker {
    private ArrayList<Worker> rejestr;
    public rejestr(){
        this.rejestr = new ArrayList<Worker>();
    }
    public void addPracownik(Worker pracownik){
        this.rejestr.add(pracownik);
    }

    public void addMultiplePracownik(Worker ...d){
        this.rejestr.addAll(Arrays.asList(d));
        }

    public void removePracownik(int id){
        this.rejestr.remove(id);
    }
    public void miastoPracownika(String city){
        rejestr = getRejestr();
        for (Worker worker : rejestr) {
            if(worker.adres.getMiasto().equals(city))
            System.out.println(worker);
        }
    }
    public String toString(){
        StringBuilder results = new StringBuilder();
        for (Worker d : rejestr){
            results.append(d.toString());
        }
        return results.toString();
    }
    public void Sortuj(){
        rejestr.sort(new ComperatorWorker());
    }

    public void Wyswietl(){
        Sortuj();
        for (Worker d : rejestr){
            String str = Integer.toString(d.ObliczWartosc());
            System.out.print(d.toString() + '\n' + "Wartosc: " + str + '\n');
        }
    };

    public ArrayList<Worker> getRejestr() {
        return rejestr;
    }

}
