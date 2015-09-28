package singleton;

/*
 *	这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程；
 *  而且这种方式是Singleton类被装载了，instance不一定被初始化，到达了lazy loading
 */
public class InnerClassSingleton {
	
	private InnerClassSingleton(){}
	
	private static class Singleton{
		private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
	}

	public InnerClassSingleton getInstance(){
		return Singleton.INSTANCE;
	}
}
