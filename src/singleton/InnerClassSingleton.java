package singleton;

/*
 *	���ַ�ʽͬ��������classloder�Ļ�������֤��ʼ��instanceʱֻ��һ���̣߳�
 *  �������ַ�ʽ��Singleton�౻װ���ˣ�instance��һ������ʼ����������lazy loading
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
