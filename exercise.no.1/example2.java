import java.util.Scanner;
public class example2
{
public static void main(string[] args)
{

int marks;
Scanner obj=new Scanner(System.in);
System.out.println("enter value of marks:");
marks=obj.nextInt();

if(marks>=90)
System.out.println("EXCELLENT");
else if(marks>=80)
System.out.println("VERY GOOD");
else if(marks>=70)
System.out.println("GOOD");
else if(marks>=60)
System.out.println("WORK HARD");
else
System.out.println("POOR");

}
}

