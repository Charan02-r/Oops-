 class School{
    void sportsday()
    {System.out.println("School sportsday");}
    
 }
 class Vmhss extends School{}
  public class Main{
    public static void main(String args[]){
      Vmhss obj = new Vmhss();
      obj.sportsday();
    }
  }