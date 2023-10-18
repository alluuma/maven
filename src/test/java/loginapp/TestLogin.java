package loginapp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	@Test
	public void test1()
	{
		Loginprogram l=new Loginprogram();
		Assert.assertEquals(0,l.CheckLogin("anc","352"));
	}
	@Test
	public void test2()
	{
		Loginprogram l=new Loginprogram();
		Assert.assertEquals(1,l.CheckLogin("alluuma","1234"));
	}

}
