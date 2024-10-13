package org.example.lesson_14

open class CelestialBodies(
    val name: String,
    val haveAtmosphere: Boolean,
    val suitableForDisembarkation: Boolean,
){}

class Planets(
    name: String,
    haveAtmosphere: Boolean,
    suitableForDisembarkation: Boolean,
    val listOfSatellites: List<Satellites>
): CelestialBodies (name, haveAtmosphere, suitableForDisembarkation) {}

class Satellites(
    name: String,
    haveAtmosphere: Boolean,
    suitableForDisembarkation: Boolean,
): CelestialBodies (name, haveAtmosphere, suitableForDisembarkation) {}

fun main() {
    val satellites1 = Satellites("alisia", true, false)
    val satellites2 = Satellites("ceura", true, true)
    val planet1 = Planets("alfaGaura", true, true, listOf(satellites1, satellites2))

    println("название планеты - ${planet1.name}")
    println()
    planet1.listOfSatellites.forEach{
        println("название cутникf: ${it.name}")
    }

}
