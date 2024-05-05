import java.util.Random; //Uso de la biblioteca para generar un número aleatoriamente

public class Celular {

    private String nombre, color;
    private int bateria; //Porcentaje de la batería
    private boolean pantallaBloqueada; // Estado de la pantalla
    
    //Constructor con parámetros para inicializar a nombre, color y batería
    public Celular(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        this.bateria = generarPorcentajeBateria();
        this.pantallaBloqueada = false; // La pantalla se inicia desbloqueada
    }

    //Constructor sin parámetros
    public Celular() {
        this.bateria = generarPorcentajeBateria();
        this.pantallaBloqueada = false; // La pantalla se inicia desbloqueada
    }

    //Método que simula la llamada de un celular
    public void llamar() {
        if (!pantallaBloqueada) {
            System.out.println("--------------------------------------");
            System.out.println("Llamando de " + nombre + " - " + color);
            System.out.println("---------------------------------------");
        } else {
            System.out.println("---------------------------------------------");
            System.out.println("No puedes llamar, la pantalla está bloqueada.");
            System.out.println("---------------------------------------------");
        }
    }

    //Método que simula el envío de un mensaje desde un celular
    public void enviarMensaje() {
        if (!pantallaBloqueada) {
            System.out.println("----------------------------------------------");
            System.out.println("Enviando mensaje desde " + nombre + " - " + color);
            System.out.println("----------------------------------------------");
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("No puedes enviar mensajes, la pantalla está bloqueada.");
            System.out.println("------------------------------------------------------");
        }
    }

    //Método que muestra el estado (nivel) de batería del celular
    public void mostrarEstadoBateria() {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("El estado de la batería de " + nombre + " - " + color + " es: " + bateria + "%");
        System.out.println("----------------------------------------------------------------------------");
    }

    //Método que cambia el color del celular
    public void cambiarColor(String nuevoColor) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Cambiando color de " + nombre + " de " + color + " a " + nuevoColor);
        System.out.println("----------------------------------------------------------------");
        color = nuevoColor;
    }

    //Método que simula la reproducción de Música
    public void reproducirMusica() {
        if (!pantallaBloqueada) {
            System.out.println("-----------------------------------------------");
            System.out.println("Reproduciendo música en " + nombre + " - " + color);
        } else {
            System.out.println("--------------------------------------------------------");
            System.out.println("No puedes reproducir música, la pantalla está bloqueada.");
            System.out.println("--------------------------------------------------------");
        }
    }

    // Método para bloquear la pantalla del celular
    public void bloquearPantalla() {
        pantallaBloqueada = true;
        System.out.println("---------------------------------------------------");
        System.out.println("Pantalla de " + nombre + " - " + color + " bloqueada.");
        System.out.println("---------------------------------------------------");
    }

    // Método para desbloquear la pantalla del celular
    public void desbloquearPantalla() {
        pantallaBloqueada = false;
        System.out.println("-------------------------------------------------------");
        System.out.println("Pantalla de " + nombre + " - " + color + " desbloqueada.");
        System.out.println("-------------------------------------------------------");
    }

    // Método para tomar una foto desde el celular
    public void tomarFoto() {
        if (!pantallaBloqueada) {
            System.out.println("--------------------------------------------");
            System.out.println("Tomando una foto con " + nombre + " - " + color);
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("--------------------------------------------------");
            System.out.println("No puedes tomar fotos, la pantalla está bloqueada.");
            System.out.println("--------------------------------------------------");
        }
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
