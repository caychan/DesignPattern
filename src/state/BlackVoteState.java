package state;

/**
 * Created by cay on 16/12/7.
 */
public class BlackVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//记录黑名单中，禁止登录系统
		System.out.println("进入黑名单，将禁止登录和使用本系统");
	}

}
