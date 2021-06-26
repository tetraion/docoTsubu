package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CreateAcountLogic;
import model.User;

/**
 * Servlet implementation class CreateAcount
 */
public class CreateAcount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータの取得
				request.setCharacterEncoding("UTF-8");
				String name = request.getParameter("name");
				String pass = request.getParameter("pass");

				// Userインスタンス（ユーザー情報）の生成
				User user = new User(name, pass);

				// アカウント作成処理
				CreateAcountLogic createAcountLogic = new CreateAcountLogic();
				createAcountLogic.create(user);


				// ログイン画面にフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("");
				dispatcher.forward(request, response);

	}

}
