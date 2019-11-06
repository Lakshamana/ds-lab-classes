public class OperationImpl implements Operation {  
   
 // Implementing the interface method 
  @Override
  public float add(int a, int b) {  
    return a + b;
  }
  
  @Override
  public float sub(int a, int b) {  
    return a - b;
  }
  
  @Override
  public float mult(int a, int b) {  
    return a * b;
  }

  @Override
  public float div(int a, int b) {  
    return a / b;
  }  
} 