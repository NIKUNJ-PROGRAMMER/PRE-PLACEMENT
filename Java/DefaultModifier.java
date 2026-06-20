//DefaultModifier
class Car{
String model;//default access
}
public class Main{
public static void main(String[] args){
Car c=new Car();
c.model="Tesla";//accessible within same package
System.out.println(c.model);
}
}
