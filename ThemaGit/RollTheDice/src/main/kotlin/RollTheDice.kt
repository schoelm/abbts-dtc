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

    var name = "init"

    fun askName(){
        println("Gebe deinen Namen ein:")
        name = readln()
    }

    askName()

    val dice = Random

    val playerScore = dice.nextInt(1..6)
    val computerScore = dice.nextInt(1..6)

    // Todo: Solange spielen bis Spieler abbricht
    // Todo: Ausgeben, wer mehr Runden gewonnen hat

    println("$name würfelt: $playerScore  --  Computer würfelt: $computerScore")
    when {
        playerScore > computerScore -> println("Du gewinnst")
        playerScore < computerScore -> println("Der Computer gewinnt")
        else -> println("Unentschieden")
    }
}