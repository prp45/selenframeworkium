package Practice;

import java.util.EventObject;

import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider="dataprovider_bookTickets")
	public void booktickets(String src,String dest)
	{
		System.out.println("BAook Tickets from "+src+"to"+dest);
	}
	public Object[][]dataprovider_bookTickets()
	{
		Object[][]obj=new Object[2][2];
		obj[0][0]="Bangalore";
		obj[0][1]="goa";
		obj[0][0]="Bangalore";
		obj[0][1]="goa";
		
		return obj;
		

	}

}
