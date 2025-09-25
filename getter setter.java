class Student {
    
    private int eage;  
    private String eName;  
    private String eDesignation;  
    private String eschool;  
  
    public int getStuage()   
    {  
        return eage;  
    }  
    public void setStuage(final int eage)   
    {  
        this.eage = eage;  
    }  
    public String getStuName()   
    {  
        return eName;  
    }  
    public void setStuName(final String eName)   
    {  

        if(eName == null ||  eName.length() <= 0)   
        {  
            throw new IllegalArgumentException();  
        }  
        this.eName = eName;  
    }  
    public String getStuDesignation()   
    {  
        return eDesignation;  
    }  
    public void setStuDesignation(final String eDesignation)   
    {  
        this.eDesignation = eDesignation;  
    }  
    public String getStuschool()   
    {  
        return eschool;  
    }  
      
    public void setStuschool(final String eschool)   
    {  
        this.eschool = eschool;  
    }  

 
    public String toString()   
    {  
        String str = "Student: [age = " + getStuage() + ", name = " + getStuName() + ", designation = " + getStuDesignation() + ", school = " + getStuschool() + "]";  
        return str;  
    }  
}  
  
public class Main   
{  
     
    public static void main(String argvs[])   
    {  
        
        final Student stu = new Student();  
         stu.setStuage(19);  
        stu.setStuName("charan");    
        stu.setStuDesignation("Software Tester");  
        stu.setStuschool("vmhss");  
          
          
        System.out.println(stu.toString());  
    }  
} 