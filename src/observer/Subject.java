package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private List<Observer> lst = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		lst.add(observer);
		System.out.println("attach a new observer: " + observer);
	}
	
	public void detach(Observer observer){
		lst.remove(observer);
		System.out.println("detach a new observer: " + observer);
	}
	
	public void notifyObservers(String state){
		for (Observer observer : lst) {
			observer.update(state);
		}
	}
	
}
