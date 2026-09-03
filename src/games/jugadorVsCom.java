package games;
import java.util.Random;
import java.util.Scanner;

public class jugadorVsCom {
	private Board board;
	
	public jugadorVsCom(Board board) {
		this.board = board;
	}
	
		public void turnoCom(char jugador) {
			jugador='O';
			Random random = new Random();
			boolean exito = false;
			
			board.mostrar();
			
			do {
				int jugada = random.nextInt(9) + 1;
				exito = board.cambiarCasilla(jugada, jugador);
				
			}while(exito == false);
			
			board.mostrar();
		}
		public void turnoJugador(char jugador) {
			boolean exito = false;
			jugador='X';
			Scanner sc = new Scanner(System.in);
			board.mostrar();
			
			do {
			System.out.print("Introduzca jugada");
			int jugada2 = sc.nextInt();
			exito = board.cambiarCasilla(jugada2, jugador);
			
			} while(exito == false);
			
			board.mostrar();
			
		}
	
	
}
