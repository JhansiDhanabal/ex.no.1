package example3;
import java.util.Scanner;

public class example3
{
public static void main(string[] args)
{
int n;
Scanner obj=new Scanner(System.in);

System.out.println("enter the last value:");
n=obj.nextInt();

for(int i=1;i<=n;i++)
   System.out.println(i+" ");
}
}