package practice;
import java.util.*;
class Natural extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i+=1){
			System.out.println(i);
			
		}
	}
}
class Even extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		for(int i=0;i<=20;i+=2){try{
			System.out.println(i);
			t.sleep(200);
		}
		catch(Exception e){
			
		}
		}
	}
}
public class multithreading {
	public static void main(String vsp[])
	{
		Natural nat = new Natural();
		Even eve = new Even();
		nat.start();
		eve.start();
		
		
	}
	

}
