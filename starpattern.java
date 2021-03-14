class starpattern
{
public static void main(String args[])
{
int i,j,k=4;
for(i=0;i<5;i++)
{
for(j=0;j<k;j++)
System.out.print(" ");
for(j=0;j<5-k;j++)
System.out.print("* ");
k--;
System.out.println();
}
}
}

