class FoodItemDataOperatorRunner{
	public static void main (String[] FoodItems)
	{
		System.out.println("Save:chats tinunu");
		String FoodItem1="vadapav";
		String FoodItem2="dabeli";
		String FoodItem3="panipuri";
		String FoodItem4="bhel";
		
		FoodItemDataOperator.save(FoodItem1);
		FoodItemDataOperator.save(FoodItem2);
		FoodItemDataOperator.save(FoodItem3);
		FoodItemDataOperator.save(FoodItem4);
		
		FoodItemDataOperator.displayDetail();
	}
}