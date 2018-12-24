import static org.junit.Assert.*;

import org.junit.Test;


public class TrainingTest {

//	
//	public static void main(String args[])
//	{
//		PublicTraining obj= new PublicTraining(200,200);
//		CorporateTraining obj1=new CorporateTraining(20,5000);
//		obj.getOrderValue();
//		obj1.getOrderValue1();
//		
//		
//		}
	@Test
	public void test() {
		PublicTraining  obj=new PublicTraining(200,5000);
		equals(250007);
		}
	@Test
	public void test1() {
		CorporateTraining  obj=new CorporateTraining(400,700);
		equals(25000);
		}

}
