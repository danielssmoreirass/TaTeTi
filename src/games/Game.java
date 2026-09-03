package games;
import java.util.Scanner;

// se ocupa de la partida: turnos, while, comprobar si terminó, etc.
public class Game {
    private Board board;
    
    // Este es el dado aun no se usa.
    public int Dado(int num) {
		 num = (int) (Math.random() * 6 + 1);
		 
		 return num;
	}
    

    public Game(Board board) {
        this.board = board;
    }
    
    public void iniciar(){
            char jugador = 'X';
            boolean juegoFinalizado = false;
            
            Scanner keyboard = new Scanner(System.in);
            
            while(juegoFinalizado == false) {
            	board.mostrar();
            	
            	System.out.println("Jugador (" + jugador + ") ingrese jugada");
            	int jugada = keyboard.nextInt();
            	
				// While modificado para que tome en cuenta si un jugador elije una casilla ocupada
				boolean movimientoExitoso = board.cambiarCasilla(jugada, jugador);
				if (movimientoExitoso){
					juegoFinalizado = board.ganador(jugador);

					if(juegoFinalizado){
						board.mostrar();
						System.out.println("El ganador es: " + jugador + "!!");
					}else{
						if (jugador == 'X'){
							jugador = 'O';
						}else {
							jugador = 'X';
						}
					}
				}
				
				
    }
	keyboard.close();
}
}