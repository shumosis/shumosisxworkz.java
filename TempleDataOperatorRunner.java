class TempleDataOperatorRunner
{
	public static void main(String[] shumos)
	{
		System.out.println("pandit save agataedare");
		String panditName1="akshay";
		String panditName2="shubham";
		String panditName3="nadeem";
		String panditName4="vaibhav";
		String panditName5="sai";
		
		
		TempleDataOperator.save(panditName1);
		TempleDataOperator.save(panditName2);
	    TempleDataOperator.save(panditName3);
		TempleDataOperator.save(panditName4);
		TempleDataOperator.save(panditName5);
		
		
		 TempleDataOperator.displayDetails();
		
	}
}