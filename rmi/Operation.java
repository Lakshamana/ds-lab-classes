import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface Operation extends Remote {  
   float add(int a, int b) throws RemoteException;  
   float sub(int a, int b) throws RemoteException;  
   float mult(int a, int b) throws RemoteException;  
   float div(int a, int b) throws RemoteException;  
} 