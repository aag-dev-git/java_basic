package super_keyword;

class Studentt
{
	Studentt()
	{
		System.out.println("I am Student");
	}
}
class Ram extends Studentt
{
	 Ram() 
	{
		super();
		System.out.println("My name is Ram");
	}
}
public class UsedToInvokeParentClassConstructor 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Ram Ram= new Ram();
	}
}