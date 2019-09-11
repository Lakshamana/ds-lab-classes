import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();
    String message = "Cadê a meta, Lucas?";
    String ipAddress = "10.16.4.47";
    InetAddress ip = InetAddress.getByName(ipAddress);

    int port = 3000;
    DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), ip, port);
    ds.send(dp);
    ds.close();
	}
}
