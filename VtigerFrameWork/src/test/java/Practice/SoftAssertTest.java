package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
	public void crateContact()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(false,false);
		System.out.println("Step4");
		System.out.println("Step5");
		soft.assertAll();
	}
	@Test
	public void modifyContact()
	{
		System.out.println("Step7");
		System.out.println("Step8");
		
	}

}
