class expression{
public static void main(String args[])
{
int a=20,b=40,c=30;
System.out.println("(101+0)/3 = "+(101+0)/3);
System.out.println("3.0e-6 * 10000000.1 = "+3.0e-6 * 10000000.1);
System.out.println("true && true = "+ (a<b && c>a));
System.out.println("false && true = "+ (a>b && b>a));
System.out.println("(false && false) || (true && true) = "+((a>b && c<a) || (c>a && b>c)));
System.out.println("(false || false) && (true && true) = "+((c<a && a>b) && (b>c && c>a)));
}}
