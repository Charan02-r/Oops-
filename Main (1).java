class Mobile {  
void ringtone (){System.out.println("ringtone...");}  
}  
class iphone extends Mobile {  
void camera(){System.out.println("camera...");}  
}  
class iQOO extends Mobile {  
void video (){System.out.println("video...");}  
}  
public class Main{  
public static void main(String args[]){  
iQOO i=new iQOO ();  
i.video();
i.ringtone();
}}
