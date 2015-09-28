package singleton;

import java.util.HashMap;

//GOF推荐的方法
public class RegistrySingleton {
	private static HashMap<String, RegistrySingleton> registry = new HashMap<String, RegistrySingleton>();
	
//	private static RegistrySingleton s = new RegistrySingleton();
	protected RegistrySingleton(){}
	
	public static RegistrySingleton getInstance(String name){
		if (name == null) {
			name = "RegistrySingleton";
		}
		if (registry.get(name) == null) {
			try {
				registry.put(name, (RegistrySingleton) Class.forName("singleton." + name).newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return registry.get(name);
	}
	public void test(){
		System.out.println("get class success!");
	}
}
