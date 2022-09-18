class Zomato{
	static double totalprice(String item)
	{
		System.out.println("enteredTheTotalPrice");
		System.out.println("Item :" +item);
		
		if(item=="Biryani")
		{
			System.out.println("Biryani");
			return 200;
		}
		return 0;
	}
}