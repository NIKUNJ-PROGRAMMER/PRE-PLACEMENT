//UserDefinedArray
import java.util.*;
public class Userarray
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size:");
int s=sc.nextInt();//reading the array size(no.of elements)
//declaring + initializing array of user given size
int[] ar=new int[s];
System.out.println("Enter elements: ");
for(int i=0;i<s;i++){
ar[i]=sc.nextInt();
}
System.out.println(" elements: ");
for(int i=0;i<s;i++){
System.out.println(ar[i]);
}
}
}
