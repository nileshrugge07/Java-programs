import java.util.Scanner;

public class SeriesDemo {

   static double sum;
   static double p;
   static double x,n;
    static Scanner sc=new Scanner(System.in);
    static void series(double x, double n)
    {


        for(int i=1;i<=n;i++)
        {
            double ex=Math.pow(x, i);
          System.out.print("\t"+ex);
          sum=sum+ex;

        }
        System.out.println("\nThe total sum of series is :- "+sum);
    }

   static void series(double p)
    {
        System.out.print("The series is :- ");
        for(int i=1;i<=p;i++)
        {
            
            System.out.print("\t"+(Math.pow(i, 3)-1));
        }

    }

   static void series()
    {
        double sum1=0;
        System.out.println("The series is :- ");
        for(double i=2;i<=10;i++)
        {
            System.out.print("\t"+1/i);
            sum1=sum1+(1/i);
        }
        System.out.println("The sum is :-"+sum1);

    }

    public static void main(String[] nils) {
        
        System.out.println("1) X1 + X2 + X3 + X4+ -------- Xn");
        System.out.println("2) 0, 7, 26, 63,------, p");
        System.out.println("3) 1/2 + 1/3 + 1/4 + ----------1/10");

        System.out.println("Select which series you want to print :- ");
        int enter=sc.nextInt();

        if(enter == 1)
        {
            System.out.println("Enter number of which series you want to print :-");
            x=sc.nextDouble();

            System.out.println("Enter limit to print series :- ");
            n=sc.nextDouble();

            series(x,n);

        }

        if(enter == 2)
        {
            System.out.println("Enter number for print  series upto last number :-");
            p=sc.nextDouble();

            series(p);

        }

        if(enter == 3)
        {

            series();

        }

        
        
    }
    
}
