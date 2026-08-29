package games;
import java.util.Scanner;

// se ocupa de la partida: turnos, while, comprobar si terminó, etc.
public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void iniciar(){
            String jugador1 = "X";
            String jugador2 = "O";
            boolean juegoFinalizado = false;
    Scanner keyboard = new Scanner(System.in);
    
    board.mostrar();

    while (juegoFinalizado == false) {
        System.out.println("Jugador 1 elije una casilla");
        char movimiento1 = keyboard.next().charAt(0);
            if (movimiento1 !=  board.mostrarContenido(1)){
                board.cambiarCasilla(movimiento1, 'X');
            }
            if(movimiento1 == board.mostrarContenido(1) );{
                System.out.println("Casilla ocupada, elije otra");
            }
        
        board.mostrar();
        }
    }
}
