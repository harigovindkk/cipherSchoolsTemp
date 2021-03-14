import java.io.*;
class grocery
{
public static void main(String args[])throws IOException
{
int k=0,flag=0,pri,i;
String itm;
double quan;
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
String items[]=new String[10];
double quantity[]=new double[10];
int price[]=new int[10];
System.out.print("Enter Your budget : ");
int budget=Integer.parseInt(ob.readLine());
int bcopy=budget;
while(true)
{
System.out.print("\n1.Add an item\n2.Exit\nEnter your choice : ");
int option=Integer.parseInt(ob.readLine());
if(option==1)
{
System.out.print("\nEnter product : ");
itm=ob.readLine();
System.out.print("Enter quantity : ");
String temp=ob.readLine();
quan=Double.parseDouble(temp.substring(0,temp.indexOf(" ")));
System.out.print("Enter Price : ");
pri=Integer.parseInt(ob.readLine());
for(i=0;i<k;i++)
{
flag=0;
if(items[i].equals(itm))
{
bcopy+=price[i];
flag=1;
break;
}
}
if(pri>bcopy)
System.out.println("\nCan't Buy the product ");
else
{
bcopy-=pri;
if(flag==0)
{
items[k]=itm;
price[k]=pri;
quantity[k]=quan;
k++;
}
else
{
price[i]=pri;
quantity[i]=quan;
}
System.out.println("\nAmount left : "+bcopy+"\n");
}
}
else
{
for(i=0;i<k;i++)
{
if(bcopy>=price[i])
{
System.out.println("\nAmount left can buy you "+items[i]);
break;
}
}
break;
}
}
System.out.println("\nGROCERY LIST is: ");
System.out.println("Product name\t\tQuantity\tPrice");
for(i=0;i<k;i++)
System.out.println(items[i]+"\t\t"+quantity[i]+" kg\t\t"+price[i]);
}
}


