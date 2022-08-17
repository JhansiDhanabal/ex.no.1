import java.util.Scanner;

public class example5
{
public static void main(string[] args)
{
int n;
Scanner obj=new Scanner(System.in);
System.out.println("enter size of array:");
n=obj.nextInt();

int a[]=new int[n];
int i=0;

System.out.println("enter array elements:");
for(i=0;i<n;i++)
{
   a[i]=obj.nextInt();
}

int small=a[0];
int big=a[0];

for(i=0;i<n;i++)
{
   if(small>a[i])
      small=a[i];
   if(big<a[i])
      big=a[i];
}

System.out.println("Maximum element = "+big);
System.out.println("Minimum element = "+small);
}
}