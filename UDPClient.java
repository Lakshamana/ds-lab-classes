import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {
    int port = 3000;
    DatagramSocket ds = new DatagramSocket();
    String message = "Cara, com 300 reais...";
    String ipAddress = "10.16.4.255";
    InetAddress ip = InetAddress.getByName(ipAddress);

    DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, port);
    ds.send(dp);

    int len = 1024;
    byte[] buf = new byte[len];

    Syste.out.println("Server listening on port " + port);
  
    DatagramSocket ds = new DatagramSocket(port);
    DatagramPacket dp = new DatagramPacket(buf, len);
    ds.receive(dp);
    
    String str = new String(dp.getData(), 0, dp.getLength());
    System.out.println(str);
    ds.close();
	}
}
