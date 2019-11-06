import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Operation stub = (Operation) registry.lookup("Operation"); 
    
         // Calling the remote method using the obtained object 
         int n1 = 1, n2 = 2;
         float result = 0;
         String op = "+";
         switch(op){
         	case "+":
         		result = stub.add(n1, n2);
         	break;
         	case "-":
         		result = stub.sub(n1, n2);
         	break;
         	case "*":
         		result = stub.mult(n1, n2);
         	break;
         	case "/":
         		result = stub.div(n1, n2);
         	break;
         }
         System.out.println("Result: " + result);
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}