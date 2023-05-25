package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date birthDate;
	
	public Client() {
	}
	
	public Client(String name, String email, Date birth) {
		this.name = name;
		this.email = email;
		this.birthDate = birth;
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

	public Date getBirth() {
		return birthDate;
	}

	public void setBirth(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}
}
