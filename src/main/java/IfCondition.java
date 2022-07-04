import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;

public class IfCondition {

    public static void main(final String[] args) {
        // Nous récupérons le nombre de millisecondes écoulées
        // entre le 01/01/1970 et le lancement de notre programme.
        // Nous stockons cette valeur dans une variable nommée "millis"
        // qui est de type "long", c'est un type de variable permettant
        // de stocker des nombres entiers plus grand que le type "int"
        // que tu connais déjà.
        final long millis = System.currentTimeMillis();

        // Si ce nombre est pair alors nous affichons une fenêtre verte,
        // sinon nous affichons une fenêtre bleue.
        if (millis % 2 == 0) {
            showFrame(Color.green);
        } else {
            showFrame(Color.blue);
        }

        // A toi de jouer ! Exécute ce programme plusieurs fois
        // pour voir si la fenêtre change de couleur !

        // Exercice : essaie de modifier ce programme pour n'appeler
        // la fonction "showFrame" qu'une seule fois et en déclarant
        // une variable pour stocker la couleur de la fenêtre à afficher.
    }

    /**
     * Déclaration d'une fonction d'affichage d'une fenêtre.
     *
     * Cette fonction est privée, c'est-à-dire que seule la classe qui la
     * contient peut l'appeler.
     *
     * Cette fonction est déclarée statique comme la fonction principale, c'est
     * nécessaire pour que la fonction principale puisse l'appeler. Nous verrons
     * les autres types de fonction très bientôt !
     *
     * Cette fonction prend un paramètre qui est la couleur souhaitée de la
     * fenêtre.
     *
     * Cette fonction ne retourne aucune valeur, son type de retour est donc
     * "void".
     */
    private static void showFrame(final Color color) {
        final Runnable execution = () -> {
            final JFrame frame = new JFrame("Test d'une fenêtre");
            JPanel panel = new JPanel();
            panel.setBackground(color);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setVisible(true);
        };

        SwingUtilities.invokeLater(execution);
    }
}
