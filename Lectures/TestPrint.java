//Zhe Dong
//Co Sci 290
//Testing different print examples

/*
  This application is a demo to test differemt
  printout statments
 */
  
public class TestPrint{

  //gain method, where the aplication starts
  public static void main(String[]args){
    System.out.println("cat");
    System.out.println(2 + 2);
    System.out.println("cat" + 2);
    System.out.println("cat" + 2 + 'c');
    System.out.println(2 + 'c' + "cat");
    System.out.print("'S\n");
    System.out.println("Hello \t World");
    
    System.out.println( " ___________                                 ._.  \n"
                      + " \\_  _____/ ______  ______  _____    ______   ____| |  \n" 
                      + "  |    __)_ /  ___/ / _____\\__  \\ \\__  _\\_/ __ \\ |  \n"
                      + "  |        \\___  \\ \\___  / __ \\|  |_  > >  ___/\\|  \n"
                      + " /_______  /____  > \\_____| >____  /   __/  \\___  >_  \n"
                      + "        \\/    \\/    \\/    \\/|__  |__|     \\/\\/   ");
  }
  
}