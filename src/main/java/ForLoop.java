public class ForLoop {

    /**
     * Petite nouveauté ! Dans la signature de notre fonction principale,
     * c'est-à-dire dans la première ligne de déclaration de notre fonction
     * principale, nous constatons que le type des arguments est "String[]". Ce
     * qui signifie que les arguments sont consignés dans un tableau. C'est
     * équivalent à la notation "String..." vu précédemment lorsqu'il s'agit du
     * dernier ou de l'unique argument de la fonction.
     */
    public static void main(final String[] args) {
        // Déclaration d'un tableau contenant des nombres entiers.
        final int[] numbers = new int[] { 5, 8, 3, 1000 };

        // Déclaration d'une boucle indexée pour afficher ces nombres un par un.
        // La variable i contient la valeur de l'index courant, c'est-à-dire
        // la position courante dans le tableau, du nombre à afficher dans la console.
        // La valeur "numbers.length" représente le nombre d'éléments contenus
        // dans le tableau.
        for (int i = 0; i < numbers.length; i++) {
            final int number = numbers[i];

            // Nouveauté !
            // Nous concaténons, c'est-à-dire que nous fusionnons, des valeurs de
            // variables avec des chaînes de caractères dans le message à afficher.
            System.out.println("index = " + i + " nombre = " + number);
        }

        // Déclaration d'une boucle simplifiée pour afficher ces nombres un par un.
        // Ici il n'est pas nécessaire d'utiliser un index pour itérer,
        // c'est-à-dire pour parcourir le tableau.
        for (final int number : numbers) {
            System.out.println(number);
        }

        // Déclaration d'un tableau à 3 éléments.
        final int[] numbers2 = new int[3];

        // Nous ajoutons 3 valeurs dans le tableau aux positions 0, 1 et 2.
        // Attention !
        // En informatique, les tableaux sont indexés à partir de 0.
        numbers2[0] = 42;
        numbers2[1] = 17;
        numbers2[2] = 3;

        // Exercice 1 : à toi de jouer ! Utilise une boucle pour afficher le contenu du tableau "numbers2".

        // Exercice 2 : à toi de jouer ! Recopie la boucle ci-dessous et essaie d'expliquer son fonctionnement.
        for (int i = 0; i < 10; i++) {
            final int mod = i % 3;

            System.out.println("i = " + i + " mod = " + mod);
        }
    }
}
