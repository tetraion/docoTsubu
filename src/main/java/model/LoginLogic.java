package model;

import java.util.List;

import dao.AcountDAO;

public class LoginLogic {
	public boolean execute(User user) {
		// データベースのアカウント情報取得
		AcountDAO acountDAO = new AcountDAO();
		List<User> users = acountDAO.findUsers();
		
		// アカウントと一致するか確認
		for (User userD : users) {
			if(user.getName().equals(userD.getName()) && user.getPass().equals(userD.getPass())) {
				return true;
			}
		}		
		return false;
	}
}
