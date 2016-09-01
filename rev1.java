import java.util.*;
class rev
{
public static void main(String []args)
{
int i;
Scanner s1=new Scanner(System.in);
String s=s1.nextLine();
String arr1[]=s.split(" ");
int a=arr1.length;
for(i=0;i<a;i++)
{
StringBuffer buf=new StringBuffer(arr1[i]);
buf.reverse();
System.out.print(buf+" ");
}

}
}
