package observer;

public class ConcreteSubject extends Subject{

	private String state;
	
	public String getState(){
		return state;
	}
	
	public void change(String newState){
		this.state = newState;
		System.out.println("��������״̬Ϊ��" + newState);
		this.notifyObservers(newState);
		
	}
}
