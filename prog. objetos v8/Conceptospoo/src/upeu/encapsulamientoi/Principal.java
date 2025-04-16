package upeu.encapsulamientoi;

public class Principal {
    public static void main(String[] args) {
        Animal a;
        a=new Loro();
        a.comer(); a.emitirSonido(); a.dormir();
        System.out.println(a.peso());

        a=new Cuervo();
        a.comer(); a.emitirSonido(); a.dormir();
        System.out.println(a.peso());
    }
}
