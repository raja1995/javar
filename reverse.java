public class reverse
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s=in.next();
int n=s.length();
StringBuffer r=new StringBuffer(s);
s=(String)r.reverse();
System.out.println(s);
}
}
