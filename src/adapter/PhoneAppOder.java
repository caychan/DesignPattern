package adapter;

//���µķ���������������
public class PhoneAppOder implements AppOrder{
	
	Order order;
	
	//�ڹ�������newԭ�ӿڵ�ʵ����
	public PhoneAppOder(){
		order = new ComputerOder();
	}

	//�����Լ�ʵ�֣����ǵ���ԭ���ķ���
	@Override
	public void updateDate(int id, String user) {
		order.updateDate(id, user, "2019-12-12");
	}
	

}
