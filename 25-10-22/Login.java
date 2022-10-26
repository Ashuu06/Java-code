package corejava_initial.programs;

public class Login {
	// Member variable of this class
	private String uname;
	private String pwd;
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getUname() {
		return this.uname;
	}
	
	public String getPwd() {
		return this.pwd;
	}
	
	public String toString()   
    {  
        String str = "Login Detail: [Username = " + getUname() + ", Password = " + getPwd()+"]";  
        return str;  
    }  

}
