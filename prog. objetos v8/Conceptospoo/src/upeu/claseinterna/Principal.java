package upeu.claseinterna;

public class Principal {

    public static void main(String[] args) {
        Madre madre = new Madre();
        madre.nombre="Brigida";
        madre.edad=30;
        madre.peso=70;
        madre.apellido="Apaza";

        Madre.Hijo hijo = madre.new Hijo();
        hijo.nombre="Raul";
        hijo.apellido= madre.apellido;
        hijo.peso=4;
        System.out.println("Madre Gestante:");
        System.out.println("Nombre:"+madre.nombre+"\nApellido:"+
                madre.apellido+"\npeso:"+madre.peso);

        System.out.println("Madre con Hijo:");
        System.out.println("Nombre:"+madre.nombre+"\nApellido:"+
                madre.apellido+"\npeso:"+(madre.peso- hijo.peso));

        System.out.println("Datos del Hijo:");
        System.out.println("Nombre:"+hijo.nombre+"\nApellido:"+
                madre.apellido+"\npeso:"+hijo.peso);

    }
}
