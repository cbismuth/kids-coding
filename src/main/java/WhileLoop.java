public class WhileLoop {

    // Nouveauté !
    // A la fin de la signature de notre fonction principale,
    // nous ajoutons "throws Exception" pour signifier qu'il
    // est possible qu'une erreur survienne.
    public static void main(final String[] args) throws Exception {
        // Nous déclarons une boucle de type "tant que".
        // Ici, tant que la variable i est strictement inférieure
        // à 5 nous attendons 1000 millisecondes, soit 1 seconde.

        // Déclaration d'une variable i pour compter le nombre de passages
        // dans la boucle.
        // Nous initialisons cette variable à la valeur 0.
        // Cette variable n'est pas finale car nous allons la modifier en lui
        // ajoutant la valeur 1 à chaque passage.
        int i = 0;

        while (i < 5) {
            System.out.println("Passage : " + i);

            // Nous attendons 1 seconde.
            // C'est cette instruction qui peut donner
            // à une erreur, mais ne t'inquiète pas.
            Thread.sleep(1000);

            // Nous incrémentons la valeur de "i" de 1.
            i = i + 1;
        }

        System.out.println("Sortie de la boucle !");

        // Exercice : affiche la valeur de la variable i à la fin du programme.
    }
}
