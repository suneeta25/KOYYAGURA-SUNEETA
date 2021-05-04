package simplecleint;
import java.io.*;
import java.net.*;
public class SimpleClient{
private DatagramSocket asocket;
BufferReader buff=new BufferReader(new InputStreamReader(System.in));
private DatagramPacket request,reply;
byte[] buffer=null;
public SimpleClient()throws SocketException{
aSocket=new DatagramSocket();
}
public void receive()throws SocketException {
buffer=new byte[1000];
request=new Datagrampacket(buffer,buffer.lengtgh);
asocket.receive(request);
System.out.println("client:+new String(request.getData()));
}
public void send()throws Exception{
buffer=buff.readLine().getBytes();
InetAddress add=InetAddress.getLocalHost();
reply=new DatagramPacket(buffer,buffer.length,add,555);
aSocket.send(reply);
}
public static void main(String[] args)throws Exception{
SimpleClient client=new SimpleClient();
while(true){
client.send();
client.receive();
}
}
}