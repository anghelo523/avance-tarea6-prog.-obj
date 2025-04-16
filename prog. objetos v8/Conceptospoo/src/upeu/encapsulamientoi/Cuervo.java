package upeu.encapsulamientoi;

public class Cuervo implements Animal {

    @Override
    public void comer() {
        System.out.println("Cocosh.....cocosh...!!!");
    }
    @Override
    public void dormir() {
        System.out.println("Dormir...Zzzz..Zz!!!");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Hey!!....que haces jugando!...");
    }
    @Override
    public String peso() {
        return "Estoy pesando 2 kilos";
    }
}
