import javax.swing.*;
import java.awt.*;

public class UneFenetre extends JFrame
{
    UnMobile sonMobile;
    private final int hauteur=400 ,largeur=400;
    final int nbCarre = 4, nbCol = 4;
    public UneFenetre()
    {
        super("mobile");
        Container leContaineur = getContentPane();
        leContaineur.setLayout(new GridLayout(nbCarre,nbCol));
        UnMobile[] mesMobiles = new UnMobile[nbCarre];

        for (int i=0; i<nbCarre; i++){
            double temps = Math.random()*100;
            int monTemps = (int)temps;
            mesMobiles[i]= new UnMobile(temps,largeur,hauteur/nbCarre);
            leContaineur.add(mesMobiles[i]);
            Thread leThread = new Thread(mesMobiles[i]);

            leThread.start();


        }
        setVisible(true);
        setSize(largeur,hauteur);
    }
}
