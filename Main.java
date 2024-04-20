package com.gamis214;

public class Main {

    public static void main(String[] args) {

        Celular celular1 = new Celular("LG","Rojo"); //Declaracion de celular 1
        celular1.llamar();

        Celular celular2 = new Celular("MOTOROLA","VERDE"); //Declaracion de celular 2
        celular2.llamar();

        Celular detalleCelular = new Celular(); //Mostrando detalle de objeto celular creado

        detalleCelular.detalleCelular(celular2);
    }
}
