package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Blob;

public class PokemonDAO {
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/bananaaulait?characterEncoding=UTF-8&serverTimezone=JST";
	String user = "root";
	String pass = "rvt/7694";

	//テーブル取得
	public UserBean findPokemon(UserBean ud) {
		//戻り値の用意
		ArrayList<UserBean> pokemonList = new ArrayList<UserBean>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			String sql = "SELECT * FROM pokemon";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				UserBean userDto = new UserBean();
				userDto.setId(rs.getInt("id"));
				userDto.setName(rs.getString("name"));
				userDto.setType(rs.getString("type"));
				userDto.setLive(rs.getString("live"));
				userDto.setImg((Blob) rs.getBlob("img"));
				pokemonList.add(userDto);
			}else {
				//アカウントが無ければnullを返す
				return null;
			}
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		return ud;
		}


}
