package CIE;
public class Internal extends Student1
{
int[] internalmarks=new int[5];

public Internal(String name,String usn,int sem,int[] internalmarks)
{
super(usn,name,sem);
this.internalmarks=internalmarks;
}
public void displayinternalmarks()
{
for(int i=0;i<5;i++)
{
System.out.println("Subject"+(i+1)+":"+internalmarks[i]);
}
}}