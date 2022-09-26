class MovieDataOperatorRunner
{
	public static void main (String[] movies )
	{
		System.out.println("Movie starts");
			String movie1="American pie1";
			String movie2="American pie2";
			String movie3="American pie3";
			String movie4="American pie4";
			String movie5="American pie5";
		
		
		MovieDataOperator.save(movie1);
		MovieDataOperator.save(movie2);
		MovieDataOperator.save(movie3);
		MovieDataOperator.save(movie4);
		MovieDataOperator.save(movie5);
		MovieDataOperator.displayDetails();
		
	}
}   