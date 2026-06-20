//ProtectedModifier
class Vehicle{
protected int speed;//protected member
}
class Bike extends Vehicle{
void setSpeed(int s){
speed=s;//accessible in subclass
}
int getSpeed(){
return speed;//accessible in subclass
}
}
public Class Main{
public static void main(String[] args){
Bike b=new Bike();
b.setSpeed(100);
System.out.println("Access via subclass method: "+b.getSpees());
}
}