package assignment;

abstract class vehicle{
	abstract void start();
	
	void stop() {
		System.out.println("Vehicle stopped");
	}
}

class car extends vehicle{
	void start() {
		System.out.println("Car started");
	}
}

public class Question_5 {


	public static void main(String[] args) {
		car c = new car();
		c.start();
		c.stop();
		
		
	}
}
