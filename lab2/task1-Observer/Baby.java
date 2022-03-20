
import java.util.ArrayList;

public class Baby implements Subject {

	private ArrayList observers;
	private boolean crying = false;
	private int level = 0;
	private String babyname;

	public Baby(String name) {
		this.babyname = name;
		observers = new ArrayList();
	}

	// pull
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(this);
		}
	}

	// push
	public void notifyObservers(String dataName, boolean dataCrying, int dataLevel) {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(dataName, dataCrying, dataLevel);
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	// push version
	// public void setData(boolean crying, int level) {
	// this.crying = crying;
	// this.level = level;
	// notifyObservers();
	// }

	public void setData(boolean crying, int level) {
		this.crying = crying;
		this.level = level;
		notifyObservers(this.babyname, crying, level);
	}

	public boolean getCrying() {
		return crying;
	}

	public int getLevel() {
		return level;
	}

	public String getName() {
		return babyname;
	}

}
