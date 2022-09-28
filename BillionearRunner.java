class BillionearRunner
{
public static void main(String[] shumos)
{
	Billionear.save("akshay");
	Billionear.save("kartik");
	Billionear.save("dharshan");
	Billionear.save("hareesh");
	Billionear.save("ravi");
	Billionear.save("hari");
	Billionear.save("Ashok");
	
	Billionear.displayrichies1();
	
	Billionear.findrichi("ravi");
	
	Billionear.updaterichi("dharshan","yogita");
	Billionear.displayrichies2();
	
	Billionear.updaterichi(5,"sakshi");
	Billionear.displayrichies3();
	
	Billionear.deleterichi("sakshi");
	Billionear.displayrichies4();
	
	Billionear.deleterichi(1,"hari");
	Billionear.displayrichies5();
}

}