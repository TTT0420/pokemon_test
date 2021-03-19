package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Blob;

import model.PokemonDto;

public class PokemonDAO {
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/bananaaulait?characterEncoding=UTF-8&serverTimezone=JST";
	String user = "root";
	String pass = "rvt/7694";

	//テーブル取得
	public ArrayList<PokemonDto> findPokemon() {
		//戻り値の用意
		ArrayList<PokemonDto> pokemonList = new ArrayList<PokemonDto>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			String sql = "SELECT * FROM pokemon";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				PokemonDto pokemon = new PokemonDto();
				pokemon.setId(rs.getInt("id"));
				pokemon.setName(rs.getString("name"));
				pokemon.setType(rs.getString("type"));
				pokemon.setLive(rs.getString("live"));
				pokemon.setImg((Blob) rs.getBlob("img"));
				pokemonList.add(pokemon);
			}
			}catch(SQLException | ClassNotFoundException e) {
				e.printStackTrace();
				return null;
			}
		return pokemonList;
		}


}
