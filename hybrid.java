class Charan    
{    
public void disp()    
{    
System.out.println("Charan");    
}    
}    
class Sai extends Charan  
{    
public void disp()    
{    
System.out.println("Sai");    
}    
}    
class Pinto extends Charan    
{    
public void disp()    
{    
System.out.println("Pinto");    
}       
}    
 class Charles extends Pinto    
{    
public void disp()    
{    
System.out.println("Charles");    
}
}
 public  class Main{
public static void main(String args[])    
{    
Charles obj = new Charles();    
obj.disp();    
}
}
  