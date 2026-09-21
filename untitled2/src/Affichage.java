public class Affichage extends Thread{
    String texte;
    Object verrou;
    public Affichage(String txt,Object verroux){texte=txt;
    verrou=verroux;}
    public void run(){
        synchronized (verrou) {
            for (int i = 0; i < texte.length(); i++) {
                System.out.print(texte.charAt(i));
                try {
                    sleep(100);
                } catch (InterruptedException e) {}
            }
        }
    }
}
