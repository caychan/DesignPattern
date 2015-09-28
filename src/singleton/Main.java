package singleton;

public class Main {

	public static void main(String[] args) {
		RegistryChildSingleton singleton = RegistryChildSingleton.getInstance();
		singleton.test();
	}

}
