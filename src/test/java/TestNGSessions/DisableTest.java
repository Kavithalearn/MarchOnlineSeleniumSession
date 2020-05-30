package TestNGSessions;

import org.testng.annotations.Test;

public class DisableTest 
{
	
	@Test
	public void test1()
	{
		System.out.println("test 1.....");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("atest 2.....");
	}
	
	@Test(enabled=true)
	public void ctest3()
	{
		System.out.println("test 3.....");
	}
	
	@Test
	public void btest4()
	{
		System.out.println("test 4.....");
	}
	
	@Test
	public void atest5()
	{
		System.out.println("test 5.....");
	}
}
