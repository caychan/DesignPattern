package singleton;


//����ʽ��֤�˶��̺߳�lazy loading���ӳټ��أ���������ʹ��synchronizedʵ��ͬ���������˷�Ӧ�ٶ�
//���������Ͷ���ʽ�������캯����Ϊprivate���Ͽ���ʹ�ù��캯�����õ����ʵ����ͨ������Ҳʹ��ʧȥ�˶�̬��
public class LazySingleton {
	private static LazySingleton lazy= null;

	private LazySingleton(){}
	
	public synchronized LazySingleton getInstance(){
		if (lazy == null) 
				lazy = new LazySingleton();
			return lazy;
	}
	
}
