package model;

import java.io.Serializable;

import com.mysql.cj.jdbc.Blob;

public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String type;
	private String live;
	private Blob img;

	public UserBean(){};

	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getLive() {
		return this.live;
	}
	public void setLive(String live) {
		this.live = live;
	}

	public Blob getImg() {
		return this.img;
	}
	public void setImg(Blob img) {
		this.img = img;
	}

}
