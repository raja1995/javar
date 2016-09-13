public class reverse
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
int n=s.length();
String r=new StringBuffer(s).reverse().toString();
System.out.println(r);
}
}
