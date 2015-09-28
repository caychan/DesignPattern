package singleton;

/*
 * һ������ͻ�ʵ��instance��û�дﵽlazy loading��
 * 
 * ���ַ�ʽ����classloder���Ʊ����˶��̵߳�ͬ�����⣬
 * ������instance����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣�
 * �ڵ���ģʽ�д�������ǵ���getInstance������ ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
 * ��ʱ���ʼ��instance��Ȼû�дﵽlazy loading��Ч����
 */
public class HungrySingleton {
	
	private static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return instance;
	}

}
