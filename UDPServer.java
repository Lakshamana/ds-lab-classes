import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(3000);
    int len = 1024;
    byte[] buf = new byte[len];
    
    DatagramPacket dp = new DatagramPacket(buf, len);
    ds.receive(dp);
    
    String str = new String(dp.getData(), 0, dp.getLength());
    System.out.println(str);
    ds.close();
	}
}