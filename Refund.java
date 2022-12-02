import java.util.ArrayList;

public class Refund implements Subject {
    String state;
    Transaction transaction;
    ArrayList<Observer> ObserevrList = new ArrayList<>();

    public Refund(Transaction t) {
        this.transaction = t;
    }

    @Override
    public void add(Observer observer) {
        ObserevrList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        ObserevrList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer i : ObserevrList) {
            i.update(state);
        }
    }
}
