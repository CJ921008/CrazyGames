package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.CrazyDBManager;

import bean.Guess;

public class GuessDAOIMPL implements GuessDAO {

	@Override
	public Guess GetOneGuessByLevel(int level) {
		// TODO Auto-generated method stub
		Guess guess= new Guess();
		Connection con=CrazyDBManager.getCon();
		PreparedStatement pStatement=null;
		ResultSet res=null;
		String sql="select * from Guess where level=?";
		try {
			pStatement=con.prepareStatement(sql);
			pStatement.setInt(1, level);
			res=pStatement.executeQuery();
			if(res.next()){
				guess.setAnswer(res.getString("answer"));
				guess.setImgName(res.getString("imgName"));
				guess.setLevel(res.getInt("level"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			CrazyDBManager.closeDB(con, pStatement, res);
		}
		
		return guess;
	}

	@Override
	public ArrayList<Guess> getAllGuess() {
		// TODO Auto-generated method stub
		ArrayList<Guess> GuessList=new ArrayList<Guess>();
		Connection con=CrazyDBManager.getCon();
		PreparedStatement pStatement=null;
		ResultSet res=null;
		String sql="select * from guess";
		try {
			pStatement=con.prepareStatement(sql);
			res=pStatement.executeQuery();
			while(res.next()){
				Guess guess=new Guess();
				guess.setLevel(res.getInt("level"));
				guess.setAnswer(res.getString("answer"));
				guess.setImgName(res.getString("imgName"));
				GuessList.add(guess);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			CrazyDBManager.closeDB(con, pStatement, res);
		}
		return GuessList;
	}

}
