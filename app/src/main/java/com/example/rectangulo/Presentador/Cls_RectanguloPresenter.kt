package com.example.rectangulo.Presentador

import com.example.rectangulo.Contrato.Rectangulocontract
import com.example.rectangulo.Modelo.Cls_RectanguloModel

class Cls_RectanguloPresenter (private val vista: Rectangulocontract.RectanguloVista): Rectangulocontract.RectanguloPresentador {
    private val modelo: Rectangulocontract.Rectangulomodel = Cls_RectanguloModel()

    override fun CalcularArea(base: Double, altura: Double) {
        if (modelo.VerificarRectangulo(base, altura))
        {
            val a= modelo.CalcularArea(base,altura)
            vista.ShowARea(a)
        }
        else{
            vista.ShowError()
        }
    }

    override fun CalcularPerimetro(base: Double, altura: Double) {
        if (modelo.VerificarRectangulo(base,altura))
        {
            val p =modelo.CalcularPerimetro(base,altura)
            vista.ShowPerimetro(p)
        }
        else{
            vista.ShowError()
        }
    }

    override fun VerificarRectangulo(base: Double, altura: Double): Boolean {
        if (base != altura)
        {
            return false
        }else
        {
            return true
        }
    }
}