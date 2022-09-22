package corejava_initial.programs;

public class Population {

  public static void main(String[] args) {
	 int initial_population = 175000;    //Initial population of town 
     int final_population = 262500;      //Total population of town
	 int increased_population = (final_population-initial_population);    //Total increased population in a decade.
		
     int average_percent = (increased_population*100)/initial_population;  //Average Population increased in a decade
     
     //Now we are calculating average increase for each year.
     double final_percent = (average_percent/10);
     System.out.println("The average percent increase in population per year:"+final_percent+"%");
	}
}

