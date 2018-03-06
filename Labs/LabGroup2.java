  import java.util.Scanner;
public class Group2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String str;
    System.out.println("Type in any number between 1-9 and a item");
    str = input.next();
    for(int index = 0; index < str.length(); index++){
      System.out.println(str.charAt(index));
    }
    System.out.println("You have" + str.substring(0, 7));
  }
}
