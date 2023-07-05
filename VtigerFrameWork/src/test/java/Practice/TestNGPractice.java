package Practice;

public class TestNGPractice {
	public void createContact()
	{
		
		System.out.println("created");
		int[]arr= {1,2,3};
		System.out.println(arr[5]);
	}
	@Test(dependsOnMethods = "createContact")
	
	
		
	}

}
