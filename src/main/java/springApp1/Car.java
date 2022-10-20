package springApp1;

public class Car implements Vehicle{

    @Override
	public void go() {
		fun();
	}
	
	public void fun() {
		System.out.println("start jurny with car...");
	}
	
	

}
