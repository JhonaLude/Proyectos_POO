public class Main {

    public static void main(String[] args) {

        Celular celular1 = new Celular("Xiaomi","Azul"); //Declaracion de celular 1
        celular1.llamar();
        celular1.enviarMensaje();
        celular1.mostrarEstadoBateria();

        Celular celular2 = new Celular("Samsung","Plateado"); //Declaracion de celular 2
        celular2.llamar();
        celular2.enviarMensaje();
        celular2.mostrarEstadoBateria();

        Celular detalleCelular = new Celular(); //Mostrando detalle de objeto celular creado

        detalleCelular.detalleCelular(celular2);
    }
}