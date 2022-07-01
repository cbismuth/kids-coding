import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.FlowLayout;

public class WindowWithButtons {

    public static void main(final String... args) {
        // Création d'une unité d'exécution pour afficher notre fenêtre,
        // cette unité ne prend aucun paramètre, il n'y a donc rien entre les parenthèses "()".
        final Runnable execution = () -> {
            // Création d'une fênetre avec un titre en paramètre.
            final JFrame frame = new JFrame("Test d'une fenêtre");

            // Création d'un panneau dans lequel nous ajouterons un bouton.
            JPanel panel = new JPanel();

            // Ajout d'un calque d'agencement des éléments qui sont ajoutés au panneau,
            // ici le type "FlowLayout" indique qu'il seront placés les uns à côté des autres.
            panel.setLayout(new FlowLayout());

            // Nous donnons la couleur verte à notre panneau.
            panel.setBackground(Color.green);

            // Création d'un bouton avec un libellé personnalisé en paramètre.
            JButton button = new JButton("Cliquez-moi");

            // Nous donnons la couleur rouge à notre bouton.
            button.setBackground(Color.RED);
            button.setOpaque(true);

            // Ajout d'une action qui sera déclenchée lorsque le bouton sera cliqué.
            button.addActionListener(actionEvent -> JOptionPane.showMessageDialog(frame, "Bien reçu !"));

            // Ajout du bouton au panneau,
            // il sera disposé automatiquement par le "FlowLayout".
            panel.add(button);

            // Ajout du panneau à la fenêtre principale.
            frame.add(panel);

            // Nous indiquons que le programme s'arrêtera quand la fenêtre sera fermée.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Nous donnons la taille souhaitée de la fenêtre,
            // le premier paramètre est le nombre de pixels horizontaux,
            // le second paramètre est le nombre de pixels verticaux.
            frame.setSize(800, 600);

            // Nous indiquons au programme d'afficher notre fenêtre.
            frame.setVisible(true);
        };

        // Nous indiquons au programme d'exécuter le code de création de notre fenêtre.
        SwingUtilities.invokeLater(execution);
    }
}
