package dao;

import java.util.ArrayList;

import bean.Guess;

public interface GuessDAO {
	//���ݹؿ�����ѯ�ؿ���Ϣ
	public Guess GetOneGuessByLevel(int level);
	//���20������
	public ArrayList<Guess> getAllGuess();
}
