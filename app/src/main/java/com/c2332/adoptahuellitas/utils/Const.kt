package com.c2332.adoptahuellitas.utils
import android.text.format.DateFormat
import java.util.Arrays
import java.util.Calendar
import java.util.Locale

object Const {

    const val MESSAGE_TYPE_TEXT = "TEXTO"
    const val MESSAGE_TYPE_IMAGE = "IMAGEN"

    fun obtenerTiempoD() : Long {
        return System.currentTimeMillis()
    }

}