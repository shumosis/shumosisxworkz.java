class Billionear

{
	static String[] billionears={null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String richies)
	{
		System.out.println("banni save maduna");
		if(billionears.length>7)
		{
			System.err.println("billionear name exceed");
		}
		if(richies!=null && richies.length()>3)
		{
			billionears[position]=richies;
			System.out.println("billionear name  " +richies +"  position   " +position );
			position++;
		}
	}
	static void displayrichies1()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref=billionears[index];
			System.out.println("richies name :"+ref);
			
		}
	}
	static boolean findrichi(String richi)
	{
		if(richi!=null && richi.length()>3)
		{
			System.out.println("array is valid");
			for (int find=0;find<billionears.length;find++)
			{
				String ref=billionears[find];
				if(ref==richi)
				{
					System.out.println("richi is found  :" +richi );
					return true;
				}
			
			}
			
			
		}
		else
		{
			System.err.println("richi is not found  "+richi);
		}
		return false;
	}	
	static void updaterichi(String oldrichi,String newrichi)
	{
		if(oldrichi!=null && newrichi!=null && oldrichi.length()>3 && newrichi.length()>3)
		{
			System.out.println("oldrichi newrichi r valid we can update");
			{
				for(int index=0;index<billionears.length;index++)
				{
					String ref=billionears[index];
					if(ref==oldrichi)
					{
						billionears[index]=newrichi;
						
	
					}
				}
			}
		}
		else
		{
		    System.out.println("oldrichi newrichi r not valid we cannot update");	
		}
	}
	static void displayrichies2()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref=billionears[index];
			System.out.println("richies name :"+ref);
			
		}
	}	
	
	static String updaterichi(int position,String newrichi)
		{
			if(position<billionears.length && newrichi.length()>3)
			{
		      billionears[position]=newrichi;
		      return newrichi;	
		    }
		return null;
		}
	static void displayrichies3()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref=billionears[index];
			System.out.println("richies name :"+ref);
			
		}
	}
	static boolean deleterichi(String richi)
    {
		if(richi!=null && richi.length()>3)
		{
			System.out.println("data is valid");
			for(int index=0;index<billionears.length;index++)
				{
					String ref=billionears[index];
					if(ref==richi)
					{
						billionears[index]=null;
						return true;
	
					}
				}
			
		}
		return false;
	} 
	static void displayrichies4()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref4=billionears[index];
			System.out.println("richies name :"+ref4);
			
		}
	}
	static boolean deleterichi(int position,String richi)
	{
			if(position<billionears.length && richi.length()>3)
			{
		      billionears[position]=null;
		      return true;	
		    }
	
		
		if(richi!=null && richi.length()>3)
		{
			System.out.println("data is valid");
			for(int index=0;index<billionears.length;index++)
				{
					String ref=billionears[index];
					if(ref==richi)
					{
						billionears[index]=null;
						return true;
	
					}
				}
			
	    }
		return false;
    }		
	static void displayrichies5()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref5=billionears[index];
			System.out.println("richies name :"+ref5);
			
		}
	}
	
		
}
		

	
	

	
