
class FruitProgram {

	public static void main(String[] args) {
		int remaining_apples = 60; // Remaining apples in percentage
		int sold_apples = 40; // Total sold apples in percentage
		int apples = 420; // Number of remaining apples
		
		// Calculation for finding total apples beforing selling
		double total_apples = (apples * 100) / remaining_apples;
		System.out.print("Originally Seller had " + total_apples + " apples");
	}

}