package upeu.obj;

import upeu.modelo.Persona;

public class ClaseGeneral {
    public static void main(String[] args) {
        Persona persona; //variable de tipo Persona
        persona = new Persona(); //persona es un objeto
        persona.setNombre("Jose");//Encapsulamiento
        persona.setEdad(12); //Encapsulamiento
        //persona.saludo();

        persona.setNombre("Raul"); // sin concepto de encapsulamiento
        persona.setEdad(18);
        persona.saludo();
    }
}
