import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface Operation extends Remote {  
   int add(int a, int b) throws RemoteException;  
} 