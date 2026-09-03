package games;

public class Main {
 public static void main (String[]args){

  System.out.println("+---------------------------------------+");
  System.out.println("|         WELCOME TO TA-TE-TI           |");
  System.out.println("+---------------------------------------+");
    
    
    Board board = new Board();

    Game game = new Game(board);

   game.iniciar();
 }
}
