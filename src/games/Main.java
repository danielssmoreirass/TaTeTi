package games;

public class Main {
 public static void main (String[]args){

    System.out.println("----------------------");
    System.out.println("Welcome to TaTeTi game");
    System.out.println("----------------------");
    
    
    Board board = new Board();

    Game game = new Game(board);

   game.iniciar();
 }
}
