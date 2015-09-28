package observer;

public class ConcreteObserver implements Observer{
	
	private String state;

	@Override
	public void update(String state) {
		this.state = state;
		System.out.println("具体观察者状态更新为：" + this.state);
	}

}
