package Beans;

public class User {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_exercises() {
		return id_exercises;
	}
	public void setId_exercises(int id_exercises) {
		this.id_exercises = id_exercises;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private int id;
	private int id_exercises;
	private String name;
	private String email;
	private String password;


}
