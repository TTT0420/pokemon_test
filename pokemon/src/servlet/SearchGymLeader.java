package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.GymLeaderDAO;
import model.GymLeaderDto;

@WebServlet("/SearchGymLeader")
public class SearchGymLeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GymLeaderDAO gymLeaderDao = new GymLeaderDAO();
		//sqlを実行
		ArrayList<GymLeaderDto> gd = gymLeaderDao.findGymLeader();
		//取得したテーブルをリクエストにセット
		request.setAttribute("gd",gd);
		//セッションにリーダー情報をセット
		HttpSession session = request.getSession();
		session.setAttribute("gymLeader", gd);

	    //フォワード先を指定
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/strategy.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
