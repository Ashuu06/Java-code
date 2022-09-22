package corejava_initial.programs;

//Creating a Parent class
public class Bank {
	int getRateOfInterest()
	{
	   return 0;
	} 
	  
	public String accountOpening()
	{  
	return null;
	} 
}

//Creating child classes.  
class SBI extends Bank{  
   int getRateOfInterest()
   {
     return 8;
   }  
 
   public String accountOpening()
   {
	return "only Offline Account Opening Services";
   }   
}  

class ICICI extends Bank{  
  int getRateOfInterest() 
  {
    return 7;
  }

  public String accountOpening()
  {
	return "Online as well as Offline Account Opening Services" ;
  }   
 }  
