//Write a program to read a string  and to test whether first and last character
//are same. The string is said to be be valid if the 1st and last character are
//the same. Else the string is said to be invalid.


import java.util.*;
class UserMainCode2{
  static int checkCharacters(String a){
    int i = 0;
    int j = (a.length())-1;
    if(a.charAt(i)==a.charAt(j)){
      return 1;
    }
    return -1;
}
}
class Main2{
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    int i = UserMainCode2.checkCharacters(s);
    if(i == 1){
      System.out.println("Valid");
    }else{
      System.out.println("Invalid");
    }
  }
}
