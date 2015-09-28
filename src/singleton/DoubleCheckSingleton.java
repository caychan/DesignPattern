package singleton;


//如果两个线程同时到达*处，一个线程获得锁，进入#，它释放后另一个线程获得锁进入#，会检查一下此时的instance状态
public class DoubleCheckSingleton {
	
	private static DoubleCheckSingleton instance = null;
	
	private DoubleCheckSingleton(){}
	
	public DoubleCheckSingleton getInstance(){
		if (instance == null) {  //*
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) { //#
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}
