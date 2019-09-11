import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPServer {
	public static void main(String[] args) throws Exception {
    int port = 3000;
		DatagramSocket ds = new DatagramSocket(port);
    int len = 1024;
    byte[] buf = new byte[len];

    Syste.out.println("Server listening on port " + port)
    
    DatagramPacket dp = new DatagramPacket(buf, len);
    ds.receive(dp);
    
    String str = new String(dp.getData(), 0, dp.getLength());
    System.out.println(str);

    String response = "NOT FOUND";
    InetAddress responseAddress = dp.getAddress();
    int responsePort = dp.getPort();
    DatagramPacket responseDp = new DatagramPacket(response.getBytes(), response.length(), responseAddress, responsePort);
    ds.send(dp);
    ds.close();
	}
}