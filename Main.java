
class Flower{
  void colour(){System.out.println("colourfull");}
  
}
class rose extends Flower{
  void red(){System.out.println("red");}
} 
class sunflower extends rose{
  void yellow(){System.out.println("yellow");}
}
public class Main{
public static void main(String args[]){
    sunflower d=new sunflower();
   d.yellow();
   d.red();
   d.colour();
}}