import CIE.Internal;
import SEE.Externals;
import java.util.Scanner;

public class PackageMain{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter usn:");
String usn=s.nextLine();
System.out.println("Enter name:");
String name=s.nextLine();
System.out.println("Enter semester:");
int sem=s.nextInt();
int imarks[]=new int[5];
int emarks[]=new int[5];

for(int i=0;i<5;i++)
{
System.out.println("Enter internal marks for Subject"+(i+1));
imarks[i]=s.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println("Enter external marks for Subject"+(i+1));
emarks[i]=s.nextInt();
}
Internal in=new Internal(usn,name,sem,imarks);
Externals e=new Externals(usn,name,sem,emarks);
in.display();
e.display();
in.displayinternalmarks();
e.displayexternalmarks();
int totalmarks=0;
for(int i=0;i<5;i++)
{
totalmarks+=imarks[i]+emarks[i]/2;
}
System.out.println("Total Marks:"+totalmarks);
System.out.println("Name : Deepthi M \n USN : 1BM23CS088");
}
}