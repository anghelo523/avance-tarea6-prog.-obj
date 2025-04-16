package upeu.polimorfabtract;

public class Loro extends Animal {
    @Override
    public void emitirSonido() { // Polimorfismo
        System.out.println("Espero que puedas aprender!!...no " +
                "estes jugando!!");
    }
    @Override
    public void comer(){
        System.out.println("Tengo hambre ...que quiero comer algo!!");
    }

}
