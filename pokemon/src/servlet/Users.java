package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserBean;

/**
 * Servlet implementation class Users
 */
@WebServlet("/Users")
public class Users extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/bananaaulait?characterEncoding=UTF-8&serverTimezone=JST";
		String user = "root";
		String password = "rvt/7694";

		//beanListを作成
		ArrayList<UserBean> beanList = new ArrayList<UserBean>();
		try {
			//jdbcドライバ読み込み
			conn = DriverManager.getConnection(url, user, password);

			//データベースへSQL分を発行
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM pokemon";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				//beanを生成
				UserBean bean = new UserBean();

				//SQLリザルトからデータを取得し、beanに保存していく
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setType(rs.getString("type"));
				bean.setLive(rs.getString("live"));

				//データを保存したbeanをbeanListに格納
				beanList.add(bean);
			}
			rs.close();
			stmt.close();
		}
//		catch (classNotFoundException e) {
//			//例外処理
//			e.printStackTrace();
//			}
		catch(SQLException e) {
			e.printStackTrace();

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

		//beanListをリクエストにセット
		request.setAttribute("beanList", beanList);
		ServletContext context = this.getServletContext();

		//フォワード先を指定
		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/jsp/home.jsp");

		//フォワード処理
		dispatcher.forward(request, response);

	}

}
