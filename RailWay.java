import java.util.Scanner;

public class RailWay {

    static double sum=0;
    public static int label=0;
    static int updateLabel;
    static String name;
   static int couch;
    static long mno;
    static int seat=1;
    static int cancelLabel=0;
    static int changesLabel;
   static Scanner sc=new Scanner(System.in);

    static void accept()
    {
        System.out.println("Enter your good name :- ");
        name=sc.nextLine();

        System.out.println("Enter your mobile number :- ");
        mno=sc.nextLong();

        System.out.println("Select which couch you want for travelling :- ");
        couch=sc.nextInt();

        System.out.println("Enter how many seat you want :- ");
        seat=sc.nextInt();

        label=1;
        
System.out.println("If you want to make some changes the press 1 otherwise 0 :-");
changesLabel=sc.nextInt();
if(changesLabel==1)
{
    update();
}
else{
    display();
}

   
    }
    static void display()
        {
            System.out.println("your enterd name is :- "+name);
            System.out.println("Your entered mobile number is :- "+mno);
            System.out.println("Total seat you have selected :-"+seat);
            if(couch==1)
            {
                sum=700*seat;
            }

            if(couch==2)
            {
                sum=500*seat;
            }

            if(couch==3)
            {
                sum=250*seat;
            }
            if(couch==4)
            {
                sum=00*seat;
            }

            System.out.println("Total amount you have to pay :- "+sum);

           

        }
    

    static void update()
    {
        System.out.println("If you want to add seat then press 1 and If you want to cancel seat the press 2:-");
        int seatUpdate=sc.nextInt();
        if (seatUpdate==1) {
           System.out.println("How many seat want to add :-");
           seat=seat+sc.nextInt(); 
           display();
        }
        else{
            System.out.println("How many seat want to cancel :-");
            int cancelseat=sc.nextInt();
          
            do{
                cancelLabel=0;
            if(seat>=cancelseat)
            {
                seat=seat-cancelseat;
                display();
            }
            else{
                System.out.println("Please enter correct data :-");
                cancelseat=sc.nextInt();
                seat=seat-cancelseat;
                display();
            }
        }while(cancelLabel==1);

        }

        
     }

    
    public static void main(String[] args) {
       
        int x;
        do{
        System.out.print("-----------------------------------------------------------------------------------------------------------\n");
        System.out.print("|");
        System.out.print("          Type of couches");
        System.out.print("                    |");
        System.out.print("                    Amount");
        System.out.print("                                 |\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------\n");


       
        System.out.print("|");
        System.out.print("          1) First AC");
        System.out.print("                        |");
        System.out.print("                    700");
        System.out.print("                                    |\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------\n");


        System.out.print("|");
        System.out.print("          2) Second AC");
        System.out.print("                       |");
        System.out.print("                    500");
        System.out.print("                                    |\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------\n");


        System.out.print("|");
        System.out.print("          3) Third AC");
        System.out.print("                        |");
        System.out.print("                    250");
        System.out.print("                                    |\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------\n");


        System.out.print("|");
        System.out.print("          4) Sleeper");
        System.out.print("                         |");
        System.out.print("                    None");
        System.out.print("                                   |\n");
        System.out.print("-----------------------------------------------------------------------------------------------------------\n");

        if(label==0)
        {
            accept();
        }
        System.out.println("If you want to continue press 1 otherwise 0:-");
        x=sc.nextInt();
        if (x==1) {
            accept();
            
        }

    }while(x != 0);
    label=0;
    System.out.println("\n\nThank you so much visit again..........!");
}
    
}
