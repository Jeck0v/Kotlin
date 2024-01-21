// A finir (message d'erreur à la fin à corriger (finir ça demain))
import java.util.*

fun main() {
    println("Bienvenue dans notre hotel !")
    println("Voulez-vous réserver une chambre ? (Oui/Non)")

    val scanner = Scanner(System.`in`)
    val answer = scanner.nextLine()

    if (answer.equals("Oui", ignoreCase = true)) {
        reservation()
    } else {
        println("Dommage, à la prochaine !")
    }
}

fun reservation() {
    println("Voici notre liste de chambres disponibles :")
    println("Chambre 1: Prix = 100 euros/nuit")
    println("Chambre 2: Prix = 150 euros/nuit")
    println("Chambre 3: Prix = 200 euros/nuit")

    println("Quelle chambre souhaitez-vous réserver ? (1/2/3)")

    val scanner = Scanner(System.`in`)
    val room = scanner.nextInt()

    println("Combien de nuits souhaitez-vous réserver cette chambre ? (Entrez un nombre allant de 1 à 7)")
    val nights = scanner.nextInt()

    val price = 100 * nights

    when (room) {
        1 -> price
        2 -> price + 50 * nights
        3 -> price + 100 * nights
        else -> {
            println("Numéro de chambre invalide.")
            return
        }
    }

    println("Le prix total de votre réservation est de $price euros.")

                                          //Partie à modifier et corriger
    val pay = scanner.nextLine()
    if (pay.equals("Oui", ignoreCase = true)) {
        println("Merci pour votre paiement ! Votre réservation est confirmée.")
    } else {
        println("Dommage, votre réservation n'est pas confirmée.")
    }

    println("Appuyez sur Entrée pour quitter.")
    scanner.nextLine()
}
