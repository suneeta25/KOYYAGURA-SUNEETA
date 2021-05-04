import java.io.*;
class Add{
public static void main(String []args)throws Exception 
{
int x,y,z;
BufferReader br=new BufferReader(new InputStreamReader(System.in));
System.out.println("Enter two numbers");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=x+y;
System.out.println("sum of two numbers is :"+z);
}
}