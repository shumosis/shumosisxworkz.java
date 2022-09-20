class CardRunner
{
	public static void main(String[] shumos)
	{
	    System.out.println("main nadita ide");
	    Card.detail();
		
	    Card.type="debit";
		Card.height=8;
		Card.width=9;
		Card.price=25;
	    String[] col={"black","white","gray"};
		Card.colors=col;
		
		Card.detail();
		System.out.println("kyalse aat");
	}
}