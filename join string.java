class Main {
  public static void main(String[] args) {
    String str1 = "what";
    String str2 = "is your";
    String str3 = "name";

    
    String joinedStr = String.join(" ",str1, str2, str3);

    System.out.println(joinedStr);
  }
}

