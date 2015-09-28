package observer;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("good morning");
	}

}
