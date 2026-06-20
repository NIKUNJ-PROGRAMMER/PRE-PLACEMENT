//SumAverage
class Main{
public static void main(String[] args){
//declare+initializing array
int[] array={2,3,4,5,6,7,8,9,1};
int sum=0;
double avg;
//accessing each element & adding to sum
//using for...each loop
for(int n: array){
sum+=n;
}
//finding unknown length
int l=array.length;
//calculating avg
//typecasting sum and length to double
avg=((double)sum/(double)l);
//printing sum and average
System.out.println("Sum: "+sum);
System.out.println("Average: "+avg);
}
}