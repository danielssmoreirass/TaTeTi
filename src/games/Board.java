package games;


public class Board {

   public Board(){
    boolean estadoDelJuego = false;
    char jugador1 = 'X';
    char jugador2 = 'O';

    //line1[0] = "x"; //Modo de modificar el array
    
    while (estadoDelJuego == false){
      mostrarTablero();
      System.out.println("Jugador 1 empieza la partida");
      break;
    }
   }
   public void mostrarTablero(){

    String[] line1 = {"-","-","-"}; 

    String[] line2 = {"-","-","-"};

    String[] line3 = {"-","-","-"};

    System.out.print(line1[0] + " | ");
    System.out.print(line1[1] + " | ");
    System.out.println(line1[2]);
   
    

    System.out.print(line2[0] + " | ");
    System.out.print(line2[1] + " | ");
    System.out.println(line2[2]);

    System.out.print(line3[0] + " | ");
    System.out.print(line3[1] + " | ");
    System.out.println(line3[2]);
   }
// Estudiar matrices para mejorar el tablero
}
