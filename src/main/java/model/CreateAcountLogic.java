package model;

import dao.AcountDAO;

public class CreateAcountLogic {
	public void create(User user) {
		AcountDAO acountDAO = new AcountDAO();
		acountDAO.create(user);
	}

}
