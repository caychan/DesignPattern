package state;

/**
 * Created by cay on 16/12/7.
 */
public interface VoteState {

	/**
	 * @param user 投票人
	 * @param voteItem 投票项
	 * @param voteManager 投票Context
	 */
	public void vote(String user, String voteItem, VoteManager voteManager);

}
