class Milestone{
	static void ShowTheResponsibility(){
		int age =25;
		char gender = 'M';
		if (age==10)
		{
			System.out.println("Responsibility is school");
		}
		if ( age==16)
		{
			System.out.println("Responsibility is collage");
		}
		if (age==18)
		{
			System.out.println("Responsibility is voter id");
			System.out.println("Responsibility is licence");
			if (gender=='F')
			{
				System.out.println("Responsibility is marrage for girls");
			}
	    }		
		if (age==21 && gender=='M')
		{
		System.out.println("Responsibility is marrage");
		}
		if (age==21|| age==22|| age==23)
		{
		System.out.println("Responsibility is graduate");	
		}
		if (age==23 || age==25)
		{
		System.out.println("Responsibility is job");
		}
		if (age==28)
		{
		System.out.println("Responsibility is kid");
		}
		if (age==30)
		{
		System.out.println("Responsibility is another kid");
		}
		if (age==45)
		{
		System.out.println("Responsibility is kids future");
		}
		if (age==50)
		{
		System.out.println("Responsibility is kids education");
		}
		if (age==58)
		{
		System.out.println("Responsibility is kids marrage");
		}
		if (age==60)
		{
		System.out.println("Responsibility is grandkids");
		}
		if (age==70)
		{
		System.out.println("Responsibility is RIP");
		}
		
		
		
	}
}