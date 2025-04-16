package upeu.encapsulamientoi;

public class Loro implements Animal {
    @Override
    public void comer() {
        System.out.println("Hola manito no molestes que " +
                "estoy comiendo mi comida favorita");
    }
    @Override
    public void dormir() {
        System.out.println("Zzz..zzz.zzz.z ");
    }
    @Override
    public void emitirSonido() {
        System.out.println("Oye atiente pues a tu profesor!!!");
    }
    @Override
    public String peso() {
        return "Esto pesando 1/2 kilos";
    }
}
