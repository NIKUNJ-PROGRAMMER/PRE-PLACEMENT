//Interface
interface class vehicle{
	void start();
	void stop();
}
class Car implements Vehicle(){
	public void start(){
		System.out.println("Car start using key ignition");
	}
	public void stop(){
		System.out.println("Car stop using hydraulic brakes");
	}
}
public class Main(){
	public static void main(String[] args){
		Vehicle v=new Car();
		v.start();
		v.stop();
	}
}
