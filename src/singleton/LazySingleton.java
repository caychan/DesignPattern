package singleton;


//懒汉式保证了多线程和lazy loading（延迟加载），但由于使用synchronized实现同步，降低了反应速度
//由于懒汉和饿汉式都将构造函数置为private，断开了使用构造函数来得到类的实例的通道，但也使类失去了多态性
public class LazySingleton {
	private static LazySingleton lazy= null;

	private LazySingleton(){}
	
	public synchronized LazySingleton getInstance(){
		if (lazy == null) 
				lazy = new LazySingleton();
			return lazy;
	}
	
}
