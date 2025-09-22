public class Instance {  
     
    public String name;  
    public int age=19;  
  
    public Instance()  
    {  
        this.name = "CHARAN";  
    }  
}  
public class Main{  
    public static void main(String[] args)  
    {  
         
       Instance obj = new Instance();  
        System.out.println("Student Name is: " + obj.name);  
        System.out.println("Age: "+ obj.age);  
    }  
}  