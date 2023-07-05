package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void create()
	{
		String expname="prabha";
		String actname="prabhavati";
		Assert.assertEquals(expname, actname);
	}
	

}
