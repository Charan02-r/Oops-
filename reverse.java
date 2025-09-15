public class Main {
    public static void main(String[] args) {
       
       
        String originalString = "A,B,C,D,E,F,G,H,I,J,K,L  M,N,O,P,R,S,T,U,V,W,X,Y,Z";
       
        StringBuilder stringBuilder = new StringBuilder(originalString);
     
        String reversedString = stringBuilder.reverse().toString();
    
     
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }
}