//Write a program to read a string of even length and to fetch two middle most
//characters from the input string and return it as string output.



import java.util.*;
class UserMainCode1{
  static String getMiddlechar(String a){
    int i = (a.length())/2;
    String s ="";
    for(int j = i-1; j<=i;j++){
      s = s+a.charAt(j);
    }
    return s;
}
}
class Main1{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int k = s.length();
    if(k%2==0){
      System.out.println(UserMainCode1.getMiddlechar(s));
    }else{
      System.out.println("Please enter even length String");
    }
  }
}
