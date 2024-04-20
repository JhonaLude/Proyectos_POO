import java.util.Random; //Uso de la biblioteca para generar un número aleatoriamente

public class Celular {

    private String nombre, color;
    private int bateria; //Porcentaje de la batería
     
    //Constructor con parámetros para inicializar a nombre, color y batería
    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.bateria = generarPorcentajeBateria();
    }

    //Constructor sin parámetros
    public Celular() {
        this.bateria = generarPorcentajeBateria();
    }

    //Método que simula la llamada de un celular
    public void llamar() {
        System.out.println("Llamando de " + nombre + " - " + color);
    }

    //Método que simula el envío de un mensaje desde un celular
    public void enviarMensaje() {
        System.out.println("Enviando mensaje desde " + nombre + " - " + color);
    }

    //Método que muestra el estado (nivel) de batería del celular
    public void mostrarEstadoBateria() {
        System.out.println("El estado de la batería de " + nombre + " - " + color + " es: " + bateria + "%");
    }

    //Método que cambia el color del celular
    public void cambiarColor(String nuevoColor) {
        System.out.println("Cambiando color de " + nombre + " de " + color + " a " + nuevoColor);
        color = nuevoColor;
    }

    //Método que simula la reproducción de Música
    public void reproducirMusica() {
        System.out.println("Reproduciendo música en " + nombre + " - " + color); //
    }

    //Método que muestra los detalles del celular
    public void detalleCelular(Celular celular) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nombre: " + celular.nombre + "\nColor:  " + celular.color);
        System.out.println("-----------------------------------------------------------");
    }

    //Método que nos permite generar un porcentaje aleatorio para la batería
    private int generarPorcentajeBateria() {
        Random rand = new Random();
        return rand.nextInt(101); // Generamos un número aleatorio para la batería entre 0 - 100 %
    }
}
