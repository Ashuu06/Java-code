//Program to calculate the salary of third Employee

class EmployeeSalary{
     public static void main(String[] args) {
         int average_salary = 10000;        //Average Salary of all three employees 
  	    int employee1 = 11000;             //Salary of First Employee
	    int employee2 = 5000;              //Salary of Second Employee
                        

	    //Calculation for finding the salary of third employee
         double third_employee  = (average_salary * 3) - (employee1+employee2);
         System.out.print("The Third Employee will earn:"+third_employee);
          
      }
}
