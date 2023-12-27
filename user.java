import java.lang.*;

public class user{
	String name;
	String password;
	String gender;
	String address;
	
	public user(String name, String password, String gender,String address){
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	public String getPassword(){
		return password;
	}
	public String getGender(){
		return gender;
	}
	public String getAddress(){
		return address;
	}
}