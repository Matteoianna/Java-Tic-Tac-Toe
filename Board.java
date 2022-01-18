public class Board {
  private char[][] board = new char[3][3];
  public boolean isWinner;

  public Board() {

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = ' ';
      }
    }
  }

  /*
   * public boolean isTaken(){ if(board[rowcx][rowxv] != ' '){ return false; }
   * return true; }
   */

  public boolean move(char p, int r, int c) {
    if (r < 0 || r > 3 || c > 3 || c < 0) {
      System.out.println("Turn skipped! you must Enter a value between 1 to 3 ;");
      return true;
    } else if (board[r][c] != ' ') {
      System.out.println("Turn skipped! The place is already taken!");
      return false;
    } else {
      board[r][c] = p;
      return true;
    }
  }

  public char get(int r, int c) {
    return board[r][c];
  }

  public String toString() {
    String output = "";
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        output += "[" + board[i][j] + "]";
      }
      output += "\n";
    }
    return output;
  }

  public boolean isWinner(char w) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][0] == w && board[i][1] == w && board[i][2] == w) {
          return true;
        } else if (board[0][j] == w && board[1][j] == w && board[2][j] == w) {
          return true;
        }
        if (board[1][1] == w) {
          if ((board[0][0] == w && board[2][2] == w) || (board[0][2] == w && board[2][0] == w)) {
            return true;
          
        }

      }

    }
    }
    return false;
    
  }
}



