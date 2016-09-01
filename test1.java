import java.util.*;
class test1
{
public static void main(String []args)
{
Scanner s1=new Scanner(System.in);
int i,j,k=0;
System.out.println("enter a1's size");
int a=s1.nextInt();
int arr1[]=new int[a];
for(i=0;i<a;i++)
{
arr1[i]=s1.nextInt();
}
System.out.println("enter a2's size");
int b=s1.nextInt();

int arr2[]=new int[b];
for(j=0;j<b;j++)
{
arr2[j]=s1.nextInt();
}
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
if(arr1[i]==arr2[j])
{
k++;
break;
}
}
}
if(k==b)
{
System.out.println("yes a2 is subset of a1");
}
else
System.out.println("not a subset");
}
}