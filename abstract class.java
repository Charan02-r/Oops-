abstract class Flower{
    abstract void blue();
}
class Rose extends Flower{    
void blue(){System.out.println("blue colour");}    
}  
public class Main{  
public static void main(String args[]){    
 Flower obj = new Rose();    
 obj.blue();    
}    
}