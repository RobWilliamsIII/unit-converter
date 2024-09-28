package com.example.unitconverter

import org.junit.Assert.assertEquals
import org.junit.Test

class UnitConverterTest {

    private val unitConverter = UnitConverter()

    @Test
    fun testCToF() {
        val result = unitConverter.cToF(0.0)
        assertEquals(32.0, result, 0.01)
    }

    @Test
    fun testFToC() {
        val result = unitConverter.fToC(32.0)
        assertEquals(0.0, result, 0.01)
    }

    @Test
    fun testKmToM() {
        val result = unitConverter.kmToM(1.0)
        assertEquals(0.621371, result, 0.001)
    }

    @Test
    fun testMToKm() {
        val result = unitConverter.mToKm(1.0)
        assertEquals(1.60934, result, 0.001)
    }

    @Test
    fun testKgToLbs() {
        val result = unitConverter.kgToLbs(1.0)
        assertEquals(2.20462, result, 0.001)
    }

    @Test
    fun testLbsToKg() {
        val result = unitConverter.lbsToKg(1.0)
        assertEquals(0.453592, result, 0.001)
    }
}
