class TempleDataOperator
{

	static String[] templeDataPanditNames={null,null,null,null,null};
	static int position=0;
	static void save(String panditName)
	{
		System.out.println("pandit pooja madataedare");
		templeDataPanditNames[position]=panditName;
		position++;
		System.out.println("saved "+panditName+ "  position" +position);
		System.out.println(" pooja mugitu prasad tugond hogri");
	}
	static void displayDetails()
	{
		for(int index=0;index<templeDataPanditNames.length;index++)
		{
			String ref=templeDataPanditNames[index];
			System.out.println(ref);
		}
	}
}
