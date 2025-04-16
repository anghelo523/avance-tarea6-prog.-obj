package upeu.enums;

enum GENERO{Masculino,Femenino};
public class Persona {

    enum ESTADO_CIVIL{Casado, Divorciado, Soltero, Viudo}

    String nombre;
    int edad;
    GENERO sexo=GENERO.Masculino;
    String estadoCivil=String.valueOf(ESTADO_CIVIL.Soltero);

    public static void main(String[] args) {
        Persona p=new Persona();
        p.nombre="Juan";
        p.edad=30;
        p.estadoCivil=String.valueOf(ESTADO_CIVIL.Casado);

        System.out.println("Nombre:"+p.nombre+"\nEdad:"+p.edad+"\nEstado Civil:"+p.estadoCivil+"\nSexo:"+p.sexo);

        for (ESTADO_CIVIL e: ESTADO_CIVIL.values()) {
            System.out.println(e);
        }
    }

}
