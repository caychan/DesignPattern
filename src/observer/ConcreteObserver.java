package observer;

public class ConcreteObserver implements Observer{
	
	private String state;

	@Override
	public void update(String state) {
		this.state = state;
		System.out.println("����۲���״̬����Ϊ��" + this.state);
	}

}
