package upeu.herencia;

public class Car extends Vehicle { //Cocepto herencia
    protected String modelo;

    public void mostraInformacion(){
        tipo="Electronico";
        setMarca("Toyota");
        modelo="Hilux";
        sonido();
    }

    public void sonido(){
        System.out.println("Tititi....");
        System.out.println("Mis caracteristicas son:\n"+
                "Marca:"+getMarca()+"\nTipo:"+tipo);
        System.out.println("Modelo:"+modelo);
    }

    public static void main(String[] args) {
        new Car().mostraInformacion();
    }
}
