//MAXMIN-JAVA
import java.util.*;
public class MaxMin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int s=sc.nextInt();
		int[] a=new int[s];
		int max=0;
		int min=s*10000;
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print("Max: "+max+", Min: "+min);
	}
}
