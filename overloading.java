class Calculator{
 
  static float multiplie(float a, float b){ 
    return a*b;
  }
  static int multiplie(int a,int b,int c ){
    return a*b*c;
    
  }
}
 public class Main{
   public static void main(String[] args) {
    Calculator calc = new Calculator (); 
   
    System.out.println(Calculator.multiplie(1.1,2.5));
    System.out.println(Calculator.multiplie(13,5,2));
   }
 }