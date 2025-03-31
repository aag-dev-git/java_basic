package super_keyword;
/**
 * It should be used if sub-class contains the same method
 * as the parent class, it is used if method overridden; 
 */
class ParentClass
{
	void show()
	{
		System.out.println("I'm Father");
	}
}
class ChildClass extends ParentClass
{
	void show()
	{
		System.out.println("I'm Child");
	}
	void work()
	{
		super.show();
		show();
	}
}
public class UsedToInvokeParentClassMethod
{
	public static void main(String[] args)
	{
		ChildClass ch= new ChildClass();
		ch.work();
	}
}