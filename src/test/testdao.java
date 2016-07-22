package test;

import java.util.ArrayList;

import bean.State;

import dao.GuessDAO;
import dao.GuessDAOIMPL;
import dao.StateDAO;
import dao.StateDAOIMPL;

public class testdao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 State state=new State();
		StateDAO sdao=new StateDAOIMPL();
		GuessDAO gdao=new GuessDAOIMPL();
		System.out.println(gdao.getAllGuess().get(0).getAnswer());
		state.setLevel(1);
		sdao.UpdateState(state);
		System.out.println(sdao.GetState().getLevel());
		
		


	}

}
