class FoodItemDataOperator{
	
	static String[] FoodItemNames={null,null,null,null};
	static int position=0;
	static void save(String FoodItemName)
	{
		System.out.println("Save: chat tinak barri savakar");
		
		FoodItemsNames[position]=FoodItemName;
		position++;
		System.out.println("Saved"      +FoodItemName+" in position"     +position);

		System.out.println("Save: savkar bhel tinda");
		
	}
	static void displayDetail()
	{
		for (int index=0;index<FoodItemNames.length;index++)
		{
			String ref=FoodItemNames[index];
			System.out.println(ref);
		}
	}
	
}