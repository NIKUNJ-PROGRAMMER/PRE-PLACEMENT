//EvenOddCount
import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int s=sc.nextInt();
		int[] a=new int[s];
		int oc=0;//odd count
		int ec=0;//even count
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				ec++;
			}else if(a[i]%2!=0)
			{
				oc++;
			}
		}
		System.out.println(f"Even Count: {ec}, Odd Count: {oc}");
	}
}
