package adapter;

//在新的方法里进行适配操作
public class PhoneAppOder implements AppOrder{
	
	Order order;
	
	//在构造器中new原接口的实现类
	public PhoneAppOder(){
		order = new ComputerOder();
	}

	//不用自己实现，而是调用原来的方法
	@Override
	public void updateDate(int id, String user) {
		order.updateDate(id, user, "2019-12-12");
	}
	

}
