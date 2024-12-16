package CIE;
public class Student1
{
String usn;
String name;
int sem;
public Student1(String usn,String name,int sem)
{
this.usn=usn;
this.name=name;
this.sem=sem;
}
public void display()
{
System.out.println("USN:"+usn+"NAME:"+name+"SEM:"+sem);
}
}