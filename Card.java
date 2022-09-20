class Card

{
	static String type="debit";
	static int height=3;
	static int width=4;
	static int price=10;
	static String[] colors={"as","bs","sc"};
	static void detail()
	{
	System.out.println(type);
	System.out.println(height);
	System.out.println(width);
	System.out.println(price);
	if (colors!=null)
	{
		System.out.println("enter the string colors");
	    for ( int index=0;index<colors.length;index++)
	   {
		String ref=colors[index];
		System.out.println(ref);
	   }
	
	}
	else
	
	     {
		System.out.println("string colors is empty");
     	 }
	}
	
}