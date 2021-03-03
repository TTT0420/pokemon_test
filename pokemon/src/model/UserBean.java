package model;

import java.io.Serializable;

public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String type;
	private String live;

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
	public void setLive(String sex) {
		this.live = live;
	}

}
