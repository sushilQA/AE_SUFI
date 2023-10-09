package SeleniumProject.SeleniumProject;

public class MethodOverloading  implements MethodOverriding{

	
	public void sum()
	{
		System.out.println("SUM");
	}
	public void sum(int a,int b)
	{
		
		System.out.println(a+b);
	}

	public void sum(String a, String b, String c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.sum(5,5);
		m.sum(10, 10, 10);
	}
	@Override
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
		// TODO Auto-generated method stub
		
	}
	
	

}


