package dao;

import java.util.ArrayList;

import bean.Guess;

public interface GuessDAO {
	//根据关卡数查询关卡信息
	public Guess GetOneGuessByLevel(int level);
	//获得20个文字
	public ArrayList<Guess> getAllGuess();
}
