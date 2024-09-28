package com.example.unitconverter


//Imports
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


//Main Class
class MainActivity : AppCompatActivity() {

    // Create instance of UnitConverter class for conversion methods
    private val unitConverter = UnitConverter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Link input to variables
        val input = findViewById<EditText>(R.id.input)
        val radioGroup = findViewById<RadioGroup>(R.id.radio_group)
        val convertButton = findViewById<Button>(R.id.convert_button)
        val output = findViewById<TextView>(R.id.output)

        // Click listener to run conversion methods
        convertButton.setOnClickListener {
            val value = input.text.toString().toDoubleOrNull()
            val selectedUnit = radioGroup.checkedRadioButtonId

            if (value != null && selectedUnit != -1) {
                // Get the selected RadioButton and its text
                val selectedRadioButton = findViewById<RadioButton>(selectedUnit)
                val selectedUnit = selectedRadioButton.text.toString()

                // Convert units
                val converted = convert(value, selectedUnit)

                    // Adjust output for selected input
                    if (selectedUnit == "Celsius" )
                        output.text = "$converted Degrees Fahrenhiet"
                    if (selectedUnit == "Fahrenheit" )
                        output.text = "$converted Degrees Celsius"
                    if (selectedUnit == "Kilometers" )
                        output.text = "$converted Miles"
                    if (selectedUnit == "Miles" )
                        output.text = "$converted Kilometers"
                    if (selectedUnit == "Kilograms" )
                        output.text = "$converted Pounds"
                    if (selectedUnit == "Pounds" )
                        output.text = "$converted Kilograms"
                } else {
                    output.text = "Please enter a value."
                }
        }
    }

    // Actual functions for conversion
    private fun convert(value: Double, unit: String): Double {
        return when (unit) {
            "Celsius" -> unitConverter.cToF(value)
            "Fahrenheit" -> unitConverter.fToC(value)
            "Kilometers" -> unitConverter.kmToM(value)
            "Miles" -> unitConverter.mToKm(value)
            "Kilograms" -> unitConverter.kgToLbs(value)
            "Pounds" -> unitConverter.lbsToKg(value)
            else -> value
        }
    }
}

