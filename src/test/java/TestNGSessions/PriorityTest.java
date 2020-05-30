package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityTest 
{
	
		
	@Test(priority=1)
	public void test1()
	{
		System.out.println("test 1.....");
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("atest 2.....");
	}
	
	@Test
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
