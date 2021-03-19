package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.GymLeaderDAO;
import model.GymLeaderDto;


@WebServlet("/SearchFirstGymLeader")
public class SearchFirstGymLeader extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GymLeaderDAO gymLeaderDao = new GymLeaderDAO();
		//sql実行
		GymLeaderDto firstGymLeader = gymLeaderDao.findFirstGymLeader();
		//セッションに情報をセット
		HttpSession session = request.getSession();
		session.setAttribute("firstGymLeader", firstGymLeader);

	    //フォワード先を指定
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/strategy.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
