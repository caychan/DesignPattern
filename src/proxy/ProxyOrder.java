package proxy;

public class ProxyOrder implements Order{
	
	Order order;
	
	public ProxyOrder(){
		order = new ComputerOder();
	}

	@Override
	public void updateDate(int id, String user, String date) {
		if (user == Constants.ADMIN) {
			order.updateDate(id, user, date);
		} else {
			System.out.println("����admin�˻���û�в���Ȩ�ޣ�");
		}
	}

	
	
}
