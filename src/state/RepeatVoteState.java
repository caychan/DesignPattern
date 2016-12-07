package state;

/**
 * Created by cay on 16/12/7.
 */
public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//重复投票，暂时不做处理
		System.out.println("请不要重复投票");
	}

}
