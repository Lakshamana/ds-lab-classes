import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote floaterface for our application 
public floaterface Operation extends Remote {  
   float add(float a, float b) throws RemoteException;  
   float sub(float a, float b) throws RemoteException;  
   float mult(float a, float b) throws RemoteException;  
   float div(float a, float b) throws RemoteException;  
} 