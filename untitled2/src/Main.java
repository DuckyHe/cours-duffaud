//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String TB="BB";
        String TA="AAA";
        Object verrou = new Object();
        Affichage afficheA = new Affichage(TA,verrou);
        Affichage afficheB = new Affichage(TB,verrou);
        afficheA.start();
        afficheB.start();
    }
}
