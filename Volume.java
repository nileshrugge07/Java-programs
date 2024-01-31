import java.util.Scanner;

public class Volume {
    static Scanner sc=new Scanner(System.in);
    static double radius,height,length,breadth,v;
    static double volume(double R)
    {
     v=(4/3)*(22/7)*R*R*R;
     return v;
    }

    static double volume(double H,double R)
    {
      v=(22/7)*(R*R)*H;  
     return v;
    }

    static double volume(double L,double B,double H)
    {
      v=L*B*H;  
     return v;
    }
    
    public static void main(String[] nils) {
       
       System.out.println("1) Sphere");
       System.out.println("2) cylinder");
       System.out.println("3) cuboid");
       System.out.println("Select any option :-");
       int a=sc.nextInt();
       if(a==1)
       {
        System.out.println("Enter radius for volume of sphere :-");
        radius=sc.nextDouble();
        System.out.println("The volume of sphere is "+volume(radius));
       }
       if(a==2)
       {
        System.out.println("Enter height for volume of cylinder :-");
        height=sc.nextDouble();

        System.out.println("Enter radius for volume of sphere :-");
        radius=sc.nextDouble();

        System.out.println("The volume of cylinder is "+volume(height,radius));
       }
       if(a==3)
       {
        System.out.println("Enter length for volume of cuboid :-");
        length=sc.nextDouble();

        System.out.println("Enter breadth for volume of cuboid :-");
        breadth=sc.nextDouble();

        System.out.println("Enter height for volume of cuboid :-");
        height=sc.nextDouble();

        System.out.println("The volume of cuboid is "+volume(length,breadth,height));
       }

    }
}
