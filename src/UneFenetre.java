import javax.swing.*;
import java.awt.*;

public class UneFenetre extends JFrame
{
    UnMobile sonMobile;
    private final int hauteur=400 ,largeur=400;
    public UneFenetre()
    {
        super("mobile");
        Container leContaineur = getContentPane();
        sonMobile = new UnMobile(largeur, hauteur);
        leContaineur.add(sonMobile);

        Thread leThread = new Thread(sonMobile);

        setVisible(true);
        setSize(largeur,hauteur);
        leThread.start();
    }
}
