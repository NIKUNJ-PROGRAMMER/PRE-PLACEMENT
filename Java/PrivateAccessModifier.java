//PrivateAccessModifier
class Person{
private String name;//private variable
public void setName(String name){
this.name=name;//accessible within class
}
public String getName(){ return name; }
}
public class Geeks{
public static void main(String[] args){
person p=new Person();
p.setName("Alice");
//System.out.println(p.name);//Error: 'name' has private access
System.out.println(p.getName());
}
}
