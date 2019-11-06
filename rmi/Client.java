import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Operation stub = (Operation) registry.lookup("Operation"); 
    
         // Calling the remote method using the obtained object 
         Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	     System.out.println("Enter n1:");
	     float n1 = Float.valueOf(myObj.nextLine());  // Read user input

	     System.out.println("Enter n2:");
	     float n2 = Float.valueOf(myObj.nextLine());  // Read user input

	     System.out.println("Enter operation:");
	     String op = myObj.nextLine();  // Read user input
	  
         float result = 0;
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