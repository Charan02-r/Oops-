 class Member{
     
     static float no;
     
 }
  public class Main{
      
  public static void main(String args[]){  
       Member m1 = new Member();  
       Member  m2 = new Member();  
       m1.no = 12.4f;  
       m2.no = 12.1f;  
       Member.no = 32.9f;  
       System.out.println("m1\'s no is: " + m1.no);  
       System.out.println("m2\'s no is: " + m2.no);  
   }  
}   