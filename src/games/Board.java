package games;


public class Board {

   public Board(){

    int[] number = new int [3];
    number[0] = 1;
    number[1] = 4;
    number[2] = 9;

    String[] line1 = {"-","-","-"}; 

    String[] line2 = {"-","-","-"};

    String[] line3 = {"-","-","-"};

    //line1[0] = "x"; //Modo de modificar el array

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
