package singleton;


//��������߳�ͬʱ����*����һ���̻߳����������#�����ͷź���һ���̻߳��������#������һ�´�ʱ��instance״̬
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
