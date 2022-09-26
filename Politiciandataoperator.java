class Politiciandataoperator{
	
	static String[] politisianNames={null,null,null,null};
	static int position=0;
	static void save(String  politisianName)
	{
		System.out.println("Save: savakar kylasa madaten anatane");
		
		politisianNames[position]= politisianName;
		position++;
		System.out.println("Saved"      + politisianName+" in position"     +position);

		System.out.println("Save: savkar kyalasa madalila");
		
	}
	static void displayDetail()
	{
		for (int index=0;index<politisianNames.length;index++)
		{
			String ref=politisianNames[index];
			System.out.println(ref);
		}
	}
	
}