import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * On crée une classe, c'est à dire une unité de traitement qui va contenir
 * notre fonction principale et les autres fonctions de notre programme.
 */
public class WindowWithDateTime {

    /**
     * On déclare ici notre fonction pricipale, dont voici les
     * caractéristiques:
     *
     * Elle est publique pour que notre programme puisse la trouver lorsqu'il
     * démarre.
     *
     * Elle est statique car il ne peut en exister qu'une seule par classe dans
     * la mémoire de l'ordinateur lorsque le programme aura démarré. Elle ne
     * peut pas être dupliquée ou clonée ou copiée, elle est unique dans la
     * classe qui la contient.
     *
     * Elle ne retourne aucune valeur ou résultat, par conséquent le type de
     * retour de notre fonction est "void", ce qui signifie inexistant.
     *
     * Elle s'appelle "main", c'est un nom obligatoire pour une fonction
     * principale, toujours pour que notre programme sache la trouver une fois
     * qu'il aura démarré.
     *
     * Enfin, entre les parathèses qui suivent le nom de la fonction, nous
     * déclarons les paramètres de cette fonction. Dans le cas de la fonction
     * principale c'est un peu particulier, car nous ne savons pas à l'avance
     * combien de paramètres l'utilisateur va vouloir lui donner au démarrage.
     * Dans ce cas-là, ce que nous faisons c'est que nous donnons à la fonction
     * un nombre de paramètres variable avec les "...".
     *
     * Donc pour résumer:
     *
     * Les paramètres ne sont pas modifiables, nous ajoutons donc le mot-clé
     * "final".
     *
     * Les paramètres sont des châines de caractères, nous leur donnons donc le
     * type "String".
     *
     * Le nombre de paramètres n'est pas connu à l'avance, on dit qu'il est
     * variable, nous ajoutons donc les "...".
     *
     * Enfin nous donnons un nom à cet ensemble de paramètres, et ce nom est
     * "args" qui est l'abréviation de "arguments". Mais tu pourrais mettre le
     * nom que tu souhaites.
     */
    public static void main(final String... args) {
        // Affichage d'un message dans la console.
        System.out.println("Le programme vient de démarrer");

        // Déclaration d'une variable nommée "date" et de type "LocalDateTime",
        // cette variable est déclarée "final" car nous ne la modifierons pas,
        // cette variable est initialisée avec la date et l'heure de maintenant.
        final LocalDateTime date = LocalDateTime.now();

        // Déclaration d'une variable de type "DateTimeFormatter",
        // cette variable va nous permettre de formatter la date et l'heure données par le système,
        // cette variable est initialisée avec le format "dd/MM/yyyy HH:mm:ss" qui correspond au format français.
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Déclaration d'une variable qui va contenir la date du système,
        // après qu'elle ait été formatée par le formateur déclaré précédemment.
        final String formattedDate = date.format(formatter);

        // Affichage de la date formatée dans la console.
        System.out.println(formattedDate);

        // Affichage de la date formatée dans une fenêtre.
        JOptionPane.showMessageDialog(null, formattedDate);
    }
}
