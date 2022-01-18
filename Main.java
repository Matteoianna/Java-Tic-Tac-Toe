import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    int rowxc = 0;
    int rowxv = 0;

    Board a = new Board();

    System.out.println("Hello! Welcome to Teo's Tic Tac Toe game! try to enjoy and have fun");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(a.toString());
   
    //while (true) {

      for (int t = 0; t <= 9; t++) {
        if (t % 2 == 0) {
         
          System.out.println("PLAYER X it's your turn,input your move!");
          System.out.println("- Column (1-3): ");
          rowxc = myInput.nextInt() - 1;
          System.out.println("- Box (1-3): ");
          rowxv = myInput.nextInt() - 1;
          a.move('x', rowxv, rowxc);
          System.out.println(a.toString());
        }else {
          System.out.println("PLAYER O it's your turn,input your move!");
          System.out.println("- Column (1-3); ");
          int rowo = myInput.nextInt() - 1;
          System.out.println("- Box (1-3): ");
          int rowx = myInput.nextInt() - 1;
          a.move('0', rowx, rowo);
          System.out.println(a.toString());
        }
        if(a.isWinner('x')){
          System.out.print("x won, congratulations!");
          break;
        } else if(a.isWinner('0')){
          System.out.print("0 won, congratulations!");
          break;
        }
         else if (t == 9) {
          System.out.println("tied game! nowone win- everyone wins, right? :)");
          break;

     
        }
      }
   
  }
  }
 
  





