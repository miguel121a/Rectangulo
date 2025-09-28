package com.example.rectangulo.Modelo

import com.example.rectangulo.Contrato.Rectangulocontract

class Cls_RectanguloModel: Rectangulocontract.Rectangulomodel {
    override fun CalcularArea(base: Double, altura: Double): Double {
        return base * altura
    }

    override fun CalcularPerimetro(base: Double, altura: Double): Double {
        return 2 * (base + altura)
    }

    override fun VerificarRectangulo(base: Double, altura: Double): Boolean {
        if (base==altura)
        {
            return false
        }else
        {
            return true
        }
    }
}