package dao;

import bean.State;

public interface StateDAO {
//查询当前state
	public State GetState();
//更新关卡和金币数
	public void UpdateState(State state);
}
