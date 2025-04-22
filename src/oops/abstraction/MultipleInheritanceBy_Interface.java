package oops.abstraction;

interface Myinterface1
{
	void print();
	
}
interface Myinterface2
{
	void show();
}
public class MultipleInheritanceBy_Interface {

	public static void main(String[] args)
	{
		Myinterface1 f1= new Multi01();
		Myinterface2 f2= new Multi01();
		f1.print();
		f2.show();
	}
}
class Multi01 implements Myinterface1,Myinterface2
{
	public void print()
	{
		System.out.println("Parent 1");
	}
	public void show()
	{
		System.out.println("Parent 2");
	}
}