class VehicleRunner
{
    public static void main(String[] shumos)
    {
	 double Ticket= Vehicle.Transport("kolhapur","ichalkaranji");
	 System.out.println(Ticket);
	 
	 double Ticket1=Vehicle.Transport("Shirdhon","Takawade",true);
	 System.out.println(Ticket1);
	  
	 boolean reasult= Vehicle.Transport("Sangali");
	 System.out.println(reasult);
	 
	 boolean reasult1=Vehicle.Transport("GokulNagar" ,true);
	 System.out.println(reasult1);
	 
	 boolean reasult2=Vehicle.Transport(true);
	 System.out.println(reasult2);
    }
}