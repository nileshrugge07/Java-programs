import java.io.*;
import java.util.*;

class SumSeries
{
public static void main(String[] nil)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
int n=sc.nextInt();

float i=1,sum=0;

while(i<=n)
{
sum=sum+1/i;
i=i+1;
}
System.out.println("The sum is  :"+sum);
}
}