package co.edu.uco.libreriauco.pruebas;

import static co.edu.uco.libreriauco.transversal.utilitarios.UtilTexto.getInstance;

public class PruebasTexto {

    public static void main(String[] args) {
        
        String miVariable = "   mi casa es azul   ";
        
        System.out.println(miVariable);
        System.out.println(getInstance().obtenerLongitudCadena(miVariable));
        System.out.println(getInstance().obtenerLongitudCadena(miVariable, true));
    }
}
