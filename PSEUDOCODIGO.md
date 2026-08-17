Pseudocodigo ta te ti

Inicio
01    Mostrar tablero vacio
02    Elegir jugador   
03       Jugador elije una casilla
04          Esa casilla esta vacia?
05              si -> Colocar marca del jugador
06                  ganaste?
07                      si -> Mensaje de ganador
08                      no -> quedan casillas libres?
09                              no -> declarar empate
10                              si -> volver al paso 2
11              no -> volver al paso 03     
Fin

Pseudocodigo de "ganaste?"

Inicio
    3 simbolos se repiten la fila 1?
        si -> Hay ganador
        no -> continuamos
    3 simbolos se repiten la fila 2?
        si -> Hay ganador
        no -> continuamos
    3 simbolos se repiten la fila 3?
        si -> Hay ganador
        no -> continuamos
    3 simbolos se repiten la columna 1?
        si -> Hay ganador
        no -> continuamos
    3 simbolos se repiten la columna 2?
        si -> Hay ganador
        no -> continuamos
    3 simbolos se repiten la columna 3?
        si -> Hay ganador
        no -> continuamos
    3 simbolos se repiten en diagona 1?
        si -> Hay ganador
        no -> continuar
    3 simbolos se repiten en diagona 2?
        si -> Hay ganador
        no -> no hay ganador
Fin