class StarPattern {
	public static void main(String[] args) 
	{
	int i, j;
		int rows = 5;
		for(i = 1; i <= rows; i++) 
		{
        		for(j = 1; j <= rows; j++) 
			{
            			if(i == j || (j == rows - i + 1)) 
				{
                			System.out.print("*");
            			}
            			else 
				{
                			System.out.print(" ");
            			}
        		}
        		System.out.println("");
    		}
	}
}