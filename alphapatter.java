class alphapatter
{
public static void main(String args[])
{
int i,j,k=8,l=65;
for(i=0;i<5;i++)
{
for(j=0;j<k;j++)
System.out.print(" ");
for(j=0;j<=i;j++)
{System.out.print((char)(l)+" ");
l++;
}
k-=2;
System.out.println();
}
}
}

