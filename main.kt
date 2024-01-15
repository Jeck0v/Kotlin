// Début To do list prochaine étape l'a connecter à une BDD
import java.util.Scanner    //permet de lire les entrées de l'utilisateur dans la console
fun main() {
    val notes = mutableListOf<String>()    //
    val scanner = Scanner(System.`in`)    //val est une variable immuable qui ne peut-être assigné qu'une seule fois
    var choice = 0    //var est une variable mutable qui peut-être assigné plusieurs fois
    while (choice != 4) {    // tant que la variable choice n'est pas égale à 4 alors le menu sera afficher
        println("1. Ajouter une Note")        //pintln() prend une chaîne de caractère en argument et affiche cette chaîne avec un saut de ligne => permet d'afficher du texte à l'utilisateur
        println("2. Modifier le contenu d'une note")
        println("3. Supprimer une note")
        println("4. Quitter")
        print("Entrer votre choix: ")    // print (esthétique / user-friendly dans ce cas là) => la sortie est sur la même ligne alors que pour println() il y a un saut de ligne à la fin 
        choice = scanner.nextInt()
        when (choice) {
            1 -> {
                print("Ajouter une note: ")
                val note = readLine()
                notes.add(note!!)
            }
            2 -> {
                println("Vos Notes: ")
                for ((index, note) in notes.withIndex()) {
                    println("$index. $note")
                }
                print("Entrer l'id de la note à modifier: ")
                val index = scanner.nextInt()
                print("Vous pouvez désormais modifier le contenue de la note: ")
                val newNote = readLine()
                notes[index] = newNote!!
            }
            3 -> {
                println("Vos notes: ")
                for ((index, note) in notes.withIndex()) {
                    println("$index. $note")
                }
                print("Entrer l'id de la note à supprimer:  ")
                val index = scanner.nextInt()
                notes.removeAt(index)
            }
        }
    }
}
