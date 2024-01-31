import java.io.*;
import java.util.*;

class Student
{

String name;
int rollNum;
float fee;

Scanner sc=new Scanner(System.in);

void inputData()
{

System.out.println("Enter your name :");
name=sc.next();

System.out.println("Enter your roll number :");
rollNum=sc.nextInt();

System.out.println("Enter your fee :");
fee=sc.nextFloat();
display();

}

void display()
{

System.out.println("Your name = "+name);
System.out.println("Your roll number = "+rollNum);
System.out.println("Your total fee = "+fee);
}

public static void main(String[] nil)
{
Student s1=new Student();
s1.inputData();
System.out.println(s1.toString());
}

}