//Method_Overloading
//Compile Time executing polymorphism
//same class, same method name, different parameter or data/return type
class Calculator{
	//Overloaded methods
	int add(int a, int b){
		return a+b;
	}
	double add(double a, double b){
		return a+b;
	}
	int add(int a, int b,int c){
		return a+b+c;
	}
}
public class Overloading{
	public static void main(String[] args){
		Calculator calc=new Calculator();
		System.out.println(calc.add(5,10)); //calls int version of 2 parameter
		System.out.println(calc.add(5.2,10.8)); //calls double version of 2 parameter
		System.out.println(calc.add(5,10,1)); //calls int version of 3 parameter
	}
}