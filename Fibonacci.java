import java.io.*;
import java.lang.*;
class Fibonacci{
public static void main(String []args)throws IOException 
{
BufferReader br=new BufferReader(new InputStreamReader(System.in));
System.out.println("Enter the numbers");
int n =Integer.parseInt(br.readLine());
int t1=0,t2=1;
System.out.println("" +t1+" "+t2);
for(int i=0;i<n;i++)
{
int t3=t1+t2;
t1=t2;
t2=t3;
System.out.println(""+t3);
}
}