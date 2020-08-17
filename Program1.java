//Write a program to read a string of 10 digit number , check whether the string
//contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit.

import java.util.*;
class UserMainCode{
  static int validateNumber(String a){
    if(a.matches("\\d{3}[-]\\d{3}[-]\\d{4}")){
      return 1;
    }else{
      return -1;
    }
}
}
class Main{
  public static void main(String [] args){
    Scanner in= new Scanner(System.in);
    String s = in.nextLine();
    int i = UserMainCode.validateNumber(s);
    if(i==1){
      System.out.println("Valid number format");
    }else{
      System.out.println("Invalid number format");
    }
  }
}
