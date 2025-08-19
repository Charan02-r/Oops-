class One{
  void star1(){System.out.println("*-$");}
}
class Two extends One{
  void star2(){System.out.println("**-$$");}
}
class Three extends Two{
  void star3(){System.out.println("***-$$$");} 
}
class Four extends Three{
  void star4(){System.out.println("****-$$$$");}
} 
class Five extends  Four{
  void  star5(){System.out.println("*****-$$$$$");}
}
public class Main{
  public static void main(String args[]){
    Five f=new Five();
    f.star1();
    f.star2();
    f.star3();
    f.star4();
    f.star5();
  }
}