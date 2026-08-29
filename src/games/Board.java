package games;

//se ocupa del tablero.

	public class Board{
		
	    // tabla de 3x3 para el tablero
	    private char[][] matriz = {
	        {'1', '2', '3'},
	        {'4', '5', '6'},
	        {'7', '8', '9'}
	    };

	    public boolean cambiarCasilla(int casilla, char jugador) {
	        if (casilla < 1 || casilla > 9) {
	            System.out.println("Casilla invalida. Elige un numero entre 1 y 9.");
	            return false;
	        }

	        //paso numero de casilla (1-9) a coordenadas de fila y columna
	        int fila = (casilla - 1) / 3;
	        int columna = (casilla - 1) % 3;

	        // revisar que la casilla no haya sido usada
	        if (matriz[fila][columna] == 'X' || matriz[fila][columna] == 'O') {
	            System.out.println("Esa casilla ya esta ocupada. Intenta de nuevo.");
	            return false;
	        }

	        matriz[fila][columna] = jugador;
	        return true;
	    }

	    // mostrar el tablero actualizado
	    public void mostrar() {
	        System.out.println();
	        for (int i = 0; i < 3; i++) {
	            System.out.println(" " + matriz[i][0] + " | " + matriz[i][1] + " | " + matriz[i][2]);
	            if (i < 2) {
	                System.out.println("---+---+---");
	            }
	        }
	        System.out.println();
	    }
    // ver si hay un ganador o si se completaron las casillas
    public boolean ganador(char jugador) {
    	
        // revisar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((matriz[i][0] == jugador && matriz[i][1] == jugador && matriz[i][2] == jugador) ||
                (matriz[0][i] == jugador && matriz[1][i] == jugador && matriz[2][i] == jugador)) {
                return true;
            }
        }
        // verificar diagonales
        if ((matriz[0][0] == jugador && matriz[1][1] == jugador && matriz[2][2] == jugador) ||
            (matriz[0][2] == jugador && matriz[1][1] == jugador && matriz[2][0] == jugador)) {
            return true;
        }
        return false;
    }
}