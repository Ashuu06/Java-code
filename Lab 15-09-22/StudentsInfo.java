class StudentsInfo
{
     //Instance Variable
	int roll_number;
	String name;
	String area;
     
     
	StudentsInfo(int roll_number)        //Creating a Parameterized Constructor
	{
	   this.roll_number = roll_number;
	}

	StudentsInfo(int roll_number, String name)      //Creating a Parameterized Constructor     
	{
	   this.roll_number = roll_number;
	   this.name = name;
	}

	StudentsInfo(int roll_number, String name, String area)     //Creating a Parameterized Constructor
	{
	   this.roll_number = roll_number;
	   this.name = name;
	   this.area = area;
	}

     //Creating Method to display the value
	void displayData()       
	{
	   System.out.println(roll_number + "   " + name + "   " + area );
	}

	public static void main( String[] args)
	{

	   //Creating objects using Constructor
	   StudentsInfo s1 = new StudentsInfo(21);
	   StudentsInfo s2 = new StudentsInfo(6,"Ashutosh");
	   StudentsInfo s3 = new StudentsInfo(8,"Vikas","Murbad");

        //Calling method to display the values of object  
	   s1.displayData(); 
        s2.displayData(); 
        s3.displayData();
	}
}