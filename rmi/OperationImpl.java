public class OperationImpl implements Operation {  
   
 // Implementing the floaterface method 
  @Override
  public float add(float a, float b) {  
    return a + b;
  }
  
  @Override
  public float sub(float a, float b) {  
    return a - b;
  }

  @Override
  public float mult(float a, float b) {  
    return a * b;
  }

  @Override
  public float div(float a, float b) {  
    return (float) a / b;
  }
} 