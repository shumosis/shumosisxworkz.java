class color
{
	static String[] colors={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String col)
	{
		System.out.println("banni save maduna");
		if(colors.length>7)
		{
			System.err.println("colors name exceed");
		}
		if(col!=null && col.length()>3)
		{
			colors[position]=col;
			System.out.println("colors name  " +col +"position   " +position );
			position++;
		}
	}
	static void displaycolor()
	{
		for(int index=0;index<colors.length;index++)
		{
			String ref=colors[index];
			System.out.println("colors name :"+ref);
			
		}
	}
	static boolean findColor(String col)
	{
		if(col!=null && col.length()>3)
		{
			System.out.println("array is valid");
			for (int find=0;find<colors.length;find++)
			{
				String ref=colors[find];
				if(ref==col)
				{
					System.out.println("color is found  :" +col );
					return true;
				}
			
			}
			
			
		}
		else
		{
			System.err.println("colour is not found  "+col);
		}
		return false;
	}
	
	
}
	
