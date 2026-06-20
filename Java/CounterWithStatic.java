//CounterWithStatic
class Counter2{
static int c=0;//static counter: memory allocated only once for all objects
Counter2(){
c++;//incrementing once stored static variable's value
System.out.println(c);
}
public static void main(String[] args){
Counter2 c1=new Counter();
Counter2 c2=new Counter();
Counter2 c3=new Counter();
}
}
//Output:
//1
//2
//3
