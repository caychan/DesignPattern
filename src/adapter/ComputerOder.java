package adapter;

public class ComputerOder implements Order {

	@Override
	public void updateDate(int id, String user, String date) {
		System.out.println("�����" + user + "�Ķ�������");
	}
		
}
