import java.util.Scanner;

public class ShowRoom {

    String name;
    long mobno;
    double cost;
    double dis;
    double amount;


    ShowRoom()
    {

    input();
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your good name :-");
        name=sc.nextLine();

        System.out.println("Enter your valid mobile number :-");
        mobno=sc.nextLong();

        System.out.println("Enter your total cost of purchased products :-");
        cost=sc.nextDouble();

        calculate();
    }

    void calculate()
    {
        if(cost<=10000)
        {
            dis=cost-(cost*5)/100;
        }

        if(cost>10000 && cost <= 20000)
        {
            dis=cost-(cost*10)/100;
        }

        if(cost>20000 && cost <= 35000)
        {
            dis=cost-(cost*15)/100;
        }

        if(cost>35000 )
        {
            dis=cost-(cost*20)/100;
        }

        display();
    }

    void display()
    {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Your name                             :- "+name+"\n");
        System.out.println("Your mobile number                    :- "+mobno+"\n");
        System.out.println("Your total amount                     :- "+cost+"\n");
        System.out.println("Your amount to be paid after discount :- "+dis+"\n");
        System.out.println("-------------------------------------------------------------------");
    }
    public static void main(String[] nils) {
         new ShowRoom();
        
    }
    
}
