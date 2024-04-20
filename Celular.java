package com.gamis214;


public class Celular {

    private String nombre,color;

    public Celular(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    public Celular(){}

    public void llamar(){
        System.out.println("Llamando de "+nombre+" - "+color);
    }

    public void detalleCelular(Celular celular){
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nombre: " + celular.nombre + "\nColor:  " + celular.color );
        System.out.println("-----------------------------------------------------------");
    }

}
