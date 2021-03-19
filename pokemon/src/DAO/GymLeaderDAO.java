package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.GymLeaderDto;

public class GymLeaderDAO {
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/bananaaulait?characterEncoding=UTF-8&serverTimezone=JST";
	String user = "root";
	String pass = "rvt/7694";

		public ArrayList<GymLeaderDto> findGymLeader() {
			//戻り値の用意
			ArrayList<GymLeaderDto> gymLeaderList = new ArrayList<GymLeaderDto>();

			try {
				//DB接続
				conn = DriverManager.getConnection(url,user,pass);
				String sql = "SELECT * FROM gym_leader";
				PreparedStatement ps = conn.prepareStatement(sql);

				//sql結果をセット
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					GymLeaderDto gymLeader = new GymLeaderDto();
					gymLeader.setId(rs.getInt("id"));
					gymLeader.setName(rs.getString("name"));
					gymLeaderList.add(gymLeader);
				}
				//接続を終了
				rs.close();
				ps.close();

				}catch(SQLException e) {
					e.printStackTrace();
				}
			return gymLeaderList;
		}



		//最初のジムリーダーを検索
		public GymLeaderDto findFirstGymLeader(){
			//戻り値の用意
			GymLeaderDto firstGymLeader = new GymLeaderDto();

			try{
				//DB接続
				conn = DriverManager.getConnection(url,user,pass);
				String sql = "SELECT * FROM gym_leader where id = 1";
				PreparedStatement ps = conn.prepareStatement(sql);

				//sql結果をセット
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
				firstGymLeader.setName(rs.getString("name"));
				}
				//接続を終了
				rs.close();
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return firstGymLeader;
		}

}
