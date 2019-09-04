import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ClienteTCPBasico {
  public static void main(String[] args) {
    try {
      String ip = "127.0.0.1";
      int port = 3030;
      Socket client = new Socket(ip, port);
      
      ObjectInputStream input = new ObjectInputStream(client.getInputStream());
      Date currentDate = (Date) input.readObject();
      JOptionPane.showMessageDialog(null, "Received Date: " + currentDate.toString());
      input.close();
      System.out.println("Connection closed");
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}