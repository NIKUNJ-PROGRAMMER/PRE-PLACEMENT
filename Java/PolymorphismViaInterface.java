//PolymorphismViaInterface
//Method OverRiding
//Interface: interface[class name], void methods, child "implements" from parent
interface Shape{
	void draw();//abstract method:no body
}
class Circle implements Shape{
	//methods always public for implementation
	public void draw(){
		System.out.println("Drawing Circle");
	}
}
class Square implements Shape{
	public void draw(){
		System.out.println("Drawing Square");
	}
}
