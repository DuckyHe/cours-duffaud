import java.awt.*;
import javax.swing.*;

public class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur, sonDebDessin;
    final int sonPas = 10, sonTemps = 50, sonCote = 40;
    int sonSens = 1; // 1 = vers la droite, -1 = vers la gauche

    public UnMobile(double temps, int telleLargeur, int telleHauteur)
    {
        super();
        saLargeur = telleLargeur;
        saHauteur = telleHauteur;
        setSize(telleLargeur, telleHauteur);
    }

    public void run()
    {
        while(true)
        {
            repaint();
            try { Thread.sleep(sonTemps); }
            catch (InterruptedException telleExcp)
            { telleExcp.printStackTrace(); }
            sonDebDessin += sonSens * sonPas;

            if (saLargeur - sonPas - sonSens <= sonDebDessin || sonDebDessin<=0 ) {
                sonSens = -sonSens;
            }
        }
    }

    public void paintComponent(Graphics telCG)
    {
        super.paintComponent(telCG);
        telCG.fillRect(sonDebDessin, saHauteur / 2, sonCote, sonCote);
    }
}
