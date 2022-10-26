package corejava_initial.programs;

public class MainLogin {
	
	public static void main(String[] args) 
	{
		Login login = new Login();
		
		login.setUname("Ashutosh Mishra");
		login.setPwd("Ashu@918010");
		
		// Displaying the details of the login details using the   
        // 'toString()' method, which uses the getter methods  
        System.out.println(login.toString());  
	}
}
