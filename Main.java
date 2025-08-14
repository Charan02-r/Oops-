interface Account {    
    void credit();    
}    
interface Ifccode {    
    void debit();    
}    
class Name implements Account,Ifccode {    
    public void credit() {    
        System.out.println("nameattack.");    
    }    
    public void debit() {    
        System.out.println("nameuse.");    
    }    
}    
class Type implements Account,Ifccode {    
    public void credit() {    
        System.out.println("typeattack.");    
    }    
    public void debit() {    
        System.out.println("typeuse.");    
    }    
}    
public class Main {    
    public static void main(String[] args) {    
        Name n= new Name();    
         Type t= new Type();    
        n.credit(); // Output: Warrior attacks with a sword.    
        n.debit(); // Output: Warrior uses a sword.    
        t.credit(); // Output: Mage attacks with a wand.    
        t.debit(); // Output: Mage uses a wand.    
    }    
}    