package com.example.unitconverter

class UnitConverter {

    // Conversion math
    fun cToF(celsius: Double): Double = ((celsius * 9) / 5) + 32
    fun fToC(fahrenheit: Double): Double = ((fahrenheit - 32) * 5) / 9
    fun kmToM(kilometers: Double): Double = (kilometers * 0.621371)
    fun mToKm(miles: Double): Double = (miles / 0.621371)
    fun kgToLbs(kilograms: Double): Double = (kilograms * 2.20462)
    fun lbsToKg(pounds: Double): Double = (pounds / 2.20462)
}
