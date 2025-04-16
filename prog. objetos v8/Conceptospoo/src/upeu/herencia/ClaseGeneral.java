package upeu.herencia;

public class ClaseGeneral extends Car {

    public void mostraInf(){
        tipo="Conbustible";
        setMarca("Toyota");
        modelo="Hilux";
        sonido();

    }

    public static void main(String[] args) {
        ClaseGeneral car = new ClaseGeneral();
        car.mostraInf();
    }

}
