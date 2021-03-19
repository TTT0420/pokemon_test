package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PokemonDAO;
import model.PokemonDto;


@WebServlet("/SearchPokemon")
public class SearchPokemon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PokemonDAO pokemonDao = new PokemonDAO();
		//sqlを実行
		ArrayList<PokemonDto> pokemonList = pokemonDao.findPokemon();
		//取得したテーブルをリクエストにセット
		request.setAttribute("pokemonList", pokemonList);


		//フォワード先を指定
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}