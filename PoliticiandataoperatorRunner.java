class PoliticiandataoperatorRunner{
	public static void main (String[] shumosis)
	{
		System.out.println("Save:savkar rauka tinda");
		String name1="vadapav";
		String name2="dabeli";
		String name3="panipuri";
		String name4="bhel";
		
		Politiciandataoperator.save(name1);
		Politiciandataoperator.save(name2);
		Politiciandataoperator.save(name3);
		Politiciandataoperator.save(name4);
		
		Politiciandataoperator.displayDetail();
	}
}