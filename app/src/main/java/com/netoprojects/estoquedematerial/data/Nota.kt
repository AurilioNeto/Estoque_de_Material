package com.netoprojects.estoquedematerial.data

import java.text.NumberFormat

class Nota(
    val id: Int = 0,
    val item: String,
    val price: Double,
    val quantity: Double
)

fun Nota.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance().format(price)