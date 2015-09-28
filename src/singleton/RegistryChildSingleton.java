package singleton;

public class RegistryChildSingleton extends RegistrySingleton{
	
	public RegistryChildSingleton(){}
	
	public static RegistryChildSingleton getInstance(){
		return (RegistryChildSingleton) RegistrySingleton.getInstance("RegistryChildSingleton");
	}
	public void test(){
		System.out.println("get child class success");
	}
}
