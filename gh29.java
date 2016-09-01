import java.util.*;
class gh29
{
public static void main(String[] args)
{
int temp=0,st=0,max=0,i,j,k=1;
Scanner s1=new Scanner(System.in);
System.out.println("enter the size");
int a=s1.nextInt();
int arr[]=new int[a];
for(i=0;i<a;i++)
{
arr[i]=s1.nextInt();
}
System.out.println("enter N");
int b=s1.nextInt();
int c=a-b;
for(i=0;i<=c;i++)
{
temp=arr[i];
for(j=i+1;j<a;j++)
{
k++;
temp=temp+arr[j];
if(k==b)
{
k=1;
break;
}
}
if(max<temp)
{
max=temp;
st=i;
}
temp=0;
}
for(i=0;i<b;i++)
{
System.out.print(arr[st]+"\t");
st++;
}






}
}
