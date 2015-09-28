package proxy;

public class Main {
	
	public static void main(String[] args){
		Order order = new ProxyOrder();  
		order.updateDate(123, "user", "2015-12-12");  
		order.updateDate(123, "admin", "2015-12-12");  
	}
    
}
