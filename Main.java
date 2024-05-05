public class Main {

    public static void main(String[] args) {

        Celular celular1 = new Celular("Xiaomi", "Azul"); // Declaración de celular 1
        celular1.llamar();
        celular1.enviarMensaje();
        celular1.mostrarEstadoBateria();
        celular1.bloquearPantalla(); // Bloquear pantalla del celular 1
        celular1.llamar(); // Intentar llamar con la pantalla bloqueada
        celular1.desbloquearPantalla(); // Desbloquear pantalla del celular 1
        celular1.llamar(); // Llamar nuevamente después de desbloquear la pantalla
        celular1.tomarFoto(); // Tomar una foto con el celular 1
        celular1.mostrarEstadoBateria();

        Celular celular2 = new Celular("Samsung", "Plateado"); // Declaración de celular 2
        celular2.llamar();
        celular2.enviarMensaje();
        celular2.mostrarEstadoBateria();
        celular2.bloquearPantalla(); // Bloquear pantalla del celular 2
        celular2.enviarMensaje(); // Intentar enviar mensaje con la pantalla bloqueada
        celular2.desbloquearPantalla(); // Desbloquear pantalla del celular 2
        celular2.reproducirMusica(); // Reproducir música con el celular 2
        celular2.tomarFoto(); // Tomar una foto con el celular 2
        celular2.mostrarEstadoBateria();

        Celular detalleCelular = new Celular(); // Mostrando detalle de objeto celular creado
        detalleCelular.detalleCelular(celular2);
    }
}
