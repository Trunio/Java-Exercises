import java.util.Comparator;

public class ComperatorWorker implements Comparator<Worker> {
    @Override
    public int compare(Worker worker, Worker worker2){
        if(worker.getDoswiadczenie() > worker2.getDoswiadczenie()) {return -1;}
        if(worker.getDoswiadczenie() < worker2.getDoswiadczenie()) {return 1;}
        else{
            if(worker.getWiek() < worker2.getWiek()){return -1;}
            if(worker.getWiek() > worker2.getWiek()){return 1;}
            else{
                return worker.getNazwisko().compareTo(worker2.getNazwisko());
            }
        }
    }
}
