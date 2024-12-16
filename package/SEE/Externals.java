package SEE;
import CIE.Student1;

public class Externals extends Student1
{
int[] externalmarks=new int[5];
public Externals(String name,String usn,int sem,int[] externalmarks)
{

super(usn,name,sem);
this.externalmarks=externalmarks;
}
public void displayexternalmarks()
{
for(int i=0;i<5;i++)
{
System.out.println("Subject"+(i+1)+":"+externalmarks[i]);
}
}}