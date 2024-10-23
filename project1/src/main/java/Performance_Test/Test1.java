package Performance_Test;

import java.util.Date;

public class Test1 {
	public static void main(String ars[]){
		try{
			long start = System.currentTimeMillis();// present date
			System.out.println(new Date());
			Thread.sleep(5000);
			long end = System.currentTimeMillis();//some end date
			System.out.println(new Date());
			long diff = start-end;//difference 
			System.out.println("Difference is:"+diff +"milliseconds");
		}
		catch(Exception e){
			System.out.println("got an Exception!");
		}
	}
}
