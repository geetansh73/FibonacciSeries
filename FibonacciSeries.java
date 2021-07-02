import java.util.*;
class FibonacciSeries
{
static void fibonacci(int a,int b,int n)
{
    if (n>2)
    {
int c=a+b;
System.out.println(c);
a=b;
b=c;
n--;
fibonacci(a,b,n);
}
}
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
    int a=0;
int b=1;
System.out.println(a+"\n"+b);
fibonacci(a,b,n);

}
}
