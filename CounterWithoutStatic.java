//CounterWithoutStatic
class counter{
int c=0;//instance variable
Counter(){
c++;//incrementing
System.out.println(c);
}
public static void main(String[] args){
//each obj will have unique counter with value 1 
//one's incrementation doesn't reflect on others
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}
//Output:
//1
//1
//1