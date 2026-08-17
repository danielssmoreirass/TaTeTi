package games;
import java.util.Scanner;

// se ocupa del tablero.
public class Board {
    char[] linea1 = {'1','2','3'}; 

    char[] linea2 = {'4','5','6'};

    char[] linea3 = {'7','8','9'};
   //line1[0] = "x"; //Modo de modificar el array

   public void cambiarCasilla(int casilla,char jugador){
    switch (casilla) {
      case 1:
        linea1[0] = jugador;
        break;
      case 2:
        linea1[1] = jugador;
        break;
      case 3:
        linea1[2] = jugador;
        break;
      case 4:
        linea2[0] = jugador;
        break;
      case 5:
        linea2[1] = jugador;
        break;
      case 6:
        linea2[2] = jugador;
        break;
      case 7:
        linea3[0] = jugador;
        break;
      case 8:
        linea3[1] = jugador;
        break;
      case 9:
        linea3[2] = jugador;
        break;
    }
    }

   public void mostrar(){
    System.out.print(linea1[0] + " | ");
    System.out.print(linea1[1] + " | ");
    System.out.println(linea1[2]);
   
    

    System.out.print(linea2[0] + " | ");
    System.out.print(linea2[1] + " | ");
    System.out.println(linea2[2]);

    System.out.print(linea3[0] + " | ");
    System.out.print(linea3[1] + " | ");
    System.out.println(linea3[2]);
   }
   
// Estudiar matrices para mejorar el tablero
}