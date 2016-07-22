package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.CrazyDBManager;
import bean.State;

public class StateDAOIMPL implements StateDAO {

	@Override
	public State GetState() {
		// TODO Auto-generated method stub
		State state = new State();
		Connection con = CrazyDBManager.getCon();
		PreparedStatement pStatement = null;
		ResultSet res = null;
		String sql = "select * from state";
		try {
			pStatement = con.prepareStatement(sql);
			res = pStatement.executeQuery();
			if (res.next()) {
				state.setGold(res.getInt("gold"));
				state.setLevel(res.getInt("level"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			CrazyDBManager.closeDB(con, pStatement, res);
		}
		return state;
	}

	@Override
	public void UpdateState(State state) {
		// TODO Auto-generated method stub
		Connection con = CrazyDBManager.getCon();
		PreparedStatement pStatement = null;
		String sql = "update state set level=?,gold=?";
		try {
			pStatement = con.prepareStatement(sql);
			pStatement.setInt(1, state.getLevel());
			pStatement.setInt(2, state.getGold());
			pStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			CrazyDBManager.closeDB(con, pStatement, null);
		}
		
	}

}
