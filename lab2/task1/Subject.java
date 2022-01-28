
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
    
    public void notifyObservers(String dataName, boolean dataCrying, int dataLevel);
}
