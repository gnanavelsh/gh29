import java.util.*;
class gh27
{
public static void main(String[] args)
{
int i,max=0,st=0,c=0	;
Scanner s1=new Scanner(System.in);
String s=s1.nextLine();
String[] arr=s.split(" ");
int a=arr.length;
for(i=0;i<a;i++)
{
StringBuffer str=new StringBuffer(arr[i]);
str.reverse();
if(arr[i].equals(str.toString()))
{
continue;
}
else
{
c=arr[i].length();
}
if(max<c)
{
max=c;
st=i;
}
}
System.out.println(arr[st]);
}
}
