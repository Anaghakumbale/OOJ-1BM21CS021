import java.util.Scanner;
public class quadratic
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("enter the value of a:");
double a=input.nextDouble();
System.out.print("enter the value of b:");
double b=input.nextDouble();
System.out.print("enter the value of c:");
double c=input.nextDouble();
double d=b*b-4*a*c;
if(d>0)
{
double r1=(-b+Math.pow(d,0.5))/(2.0*a);
double r2=(-b-Math.pow(d,0.5))/(2.0*a);
System.out.println("the roots are real and distinct r1="+r1+"and r2="+r2);
}
else if(d==0.0)
{
double r1=-b/(2.0*a);
System.out.println("the roots are real and equal r1=r2="+r1);
}
else 
{
double r1=-b/(2*a);
double r2=Math.sqrt(-d) / (2 * a);
System.out.println("roots are not real");
System.out.println("r1="+r1+"+i"+r2+" and r2="+r1+"-i"+r2);
}
}
}