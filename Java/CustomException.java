//CustomException
class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}

class Test{
	public static void main(String[] args){
		try{
			throw new MyException("Custom Exception Occured");
		}
		catch(MyException e){
			System.out.println(e);
		}
	}
}
