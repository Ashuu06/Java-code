package corejava_initial.programs;

public class LargestElementArray {
	
	static int arr[] = {10, 34, 45, 90, 98};
	
	// Method to find maximum in array
    static int largest()
    {
        int i;
         
        // Initialize maximum element
        int max = arr[0];
      
        // Traverse array elements from second and
        // compare every element with current max 
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
      
        return max;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }

}
