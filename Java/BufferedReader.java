//BufferedReader

import java.util.*;
public class BR{
public static void main(String[] args) throws IOException{

//Enter data using BufferedReader
BufferedReader b= new BufferedReader(new InputStreamReader(System.in));

//Reading data using readLine
String name=b.readLine();

//Printing the read line
System.out.println(name);
}
}
