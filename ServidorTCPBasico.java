import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.io.IOException;

public class ServidorTCPBasico {
  public static void main(String[] args) {
    try {
      int port = 3030;
      ServerSocket server = new ServerSocket(port);
      System.out.println("Server listening at port " + port);

      while(true) {
        Socket client = server.accept();
        System.out.println("Started new connection: " + client.getInetAddress().getHostAddress());

        ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        out.flush();
        out.writeObject(new Date());
        out.close();
        client.close();
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}