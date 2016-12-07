package state;

/**
 * Created by cay on 16/12/7.
 */
public class Main {
	public static void main(String[] args) {
		VoteManager vm = new VoteManager();
		for(int i = 0; i < 10; i ++){
			vm.vote("user", "A");
		}
	}
}
