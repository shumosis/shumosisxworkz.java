class pasteRunner
{
	public static void main(String[] shumos)
	{
		paste.setAyurvedic(true);
		boolean Ayurvedic = paste.isAyurvedic();
		System.out.println(Ayurvedic);
		
		paste.setclinicallyProoven(false);
		boolean clinicallyProoven = paste.isclinicallyProoven();
		System.out.println(clinicallyProoven);
		
		paste.setfights7Problem(true);
		boolean fights7Problem = paste.isfights7Problem();
		System.out.println(fights7Problem);
		
		paste.settasteIsGood(false);
		boolean tasteIsGood = paste.istasteIsGood();
		System.out.println(tasteIsGood);
		
		
		paste.setname("dabur");
		String name=paste.getname();
		System.out.println(name);
		
		
		paste.setprice(9);
		int price=paste.getprice();
		System.out.println(price);
		
		
		paste.setweight(20);
		int weight=paste.getweight();
		System.out.println( weight);
		
		
		paste.setbatchno(4);
		int batchno=paste.getbatchno();
		System.out.println(batchno);
		
		
		paste.setnumber(8867114944d);
		int number=paste.getnumber();
		System.out.println(number);
		
		
		paste.setexpirydate(2022);
		int expirydate=paste.getexpirydate();
		System.out.println(expirydate);
		
		
		paste.setemail("dabur@gmail.com");
		String email=paste.getemail();
		System.out.println(email);
		
		
		paste.setwebsite("dabur.com");
		String website=paste.getwebsite();
		System.out.println(website);
		
		
		paste.setname("dabur");
		String name=paste.getname();
		System.out.println(name);
		
		
		paste.setcity("goa");
		String city=paste.getcity();
		System.out.println(city);
		
		
		paste.setcolor("red");
		String color=paste.getcolor();
		System.out.println(color);
		
		
		paste.setpastecolor("raddish");
		String pastecolor=paste.getpastecolor();
		System.out.println(pastecolor);
		
		
		
	}
}