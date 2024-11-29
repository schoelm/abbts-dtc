import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Simuliert ein einfaches Würfelspiel zwischen dem
 * Computer und einem Spieler
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

fun main() {

    val dice = Random

    val playerScore = dice.nextInt(1..6)
    val computerScore = dice.nextInt(1..6)

    // Todo: Den Spieler nach dem Namen fragen
    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat

    println("Du würfelst: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> println("Du gewinnst")
        playerScore < computerScore -> println("Der Computer gewinnt")
        else -> println("Unentschieden")
    }
}