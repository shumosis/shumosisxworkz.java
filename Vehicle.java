class Vehicle
{
	static double Transport(String source , String Destination)
	{
	 System.out.println("entered the method" );
	 if (source=="kolhapur" && Destination=="ichalkaranji")
	 {
		 System.out.println("Transport charges :");
		 return 35d;
	 }
	 return 0;
	}
	static double Transport(String source , String Destination, boolean OnTime)
	{
	 System.out.println("entered the method" );
	 if (source=="Shirdhon" && Destination=="Takawade" && OnTime==true)
	 {
		 System.out.println("Transport charges :");
		 return 100d;
	 }
	 return 0;
	}
	static boolean Transport( String Destination)
	{
	 System.out.println("entered the method" );
	 if (Destination=="Sangali" )
	 {
		 System.out.println("Majane maja :");
		 return true;
	 }
	 return false;
	}
	
	static boolean Transport( String Destination , boolean OnTime)
	{
	 System.out.println("entered the method" );
	 if (Destination=="GokulNagar" && OnTime==true)
	 {
		 System.out.println("I will be very happy :");
		 return true;
	 }
	 return false;
	}
	static boolean Transport( boolean OnTime)
	{
	 System.out.println("entered the method" );
	 if (OnTime==true )
	 {
		 System.out.println("I will be very happy :");
		 return true;
	 }
	 return false;
	}
	
}