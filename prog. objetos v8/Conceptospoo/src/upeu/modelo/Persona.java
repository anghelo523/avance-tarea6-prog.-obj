package upeu.modelo;

public class Persona {
    private String nombre;
    private int edad;

    public void saludo(){
        System.out.println("Hola, mi nombre es "+nombre+
                " y tengo "+edad+" años");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
