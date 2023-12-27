import java.lang.*;

public class users{
	user userList[] = new user[100];
	public static int userCount=0;
	
	public users(){
		user u1 = new user("sabbir","1234","Male","Dhaka");
		user u2 = new user("nakib","5678","Male","Bogura");	
		userList[userCount] = u1;
		userCount++;
		userList[userCount] = u2;
		userCount++;
	}
	public int userExists(String name){
		int index = -1;
		for(int i=0;i<userCount;i++){
			if((userList[i].getName()).equals(name)){
				index = i;
				break;
			}
		}
		return index;
	}
	public user getUser(int index, String pass){
		if((userList[index].getPassword()).equals(pass)){
			return userList[index];
		}else{ return null; }
	}
	public void addUser(user u){
		userList[userCount] = u;
		userCount++;
	}
}