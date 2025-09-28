package com.example.rectangulo.Presentador

import com.example.rectangulo.Contrato.Rectangulocontract
import com.example.rectangulo.Modelo.Cls_RectanguloModel

class Cls_RectanguloView: Rectangulocontract.RectanguloVista{
    private lateinit var presenter: Rectangulocontract.RectanguloPresentador
    fun setPresenter(presentador: Rectangulocontract.RectanguloPresentador){
        presenter= presentador;
    }
    fun inicio(){
        println("Captura la base de un rectangulo: ")
        val base: Double = readln().toDouble()
        println("Captura la altura de un rectangulo: ")
        val altura: Double = readln().toDouble()

        println("--- Menú de opciones ---");
        println("1. Calcular el Area .....")
        println("2. Calcular el Perimetro .....")
        println("3. Verificar rectangulo.....")
        println("Elige una opcion.....")
        val opc = readln().toString()
        when(opc){
            "1"->presenter.CalcularArea(base,altura)
            "2"->presenter.CalcularPerimetro(base, altura)
            "3"->presenter.VerificarRectangulo(base, altura)
        }
    }

    override fun ShowARea(Area: Double) {
        println("El area del rectanguñp es: ${Area}")
    }

    override fun ShowPerimetro(Perimetro: Double) {
        println("El perimetro del rectangulo es: ${Perimetro}")
    }

    override fun ShowError() {
        println("No se puede realizar...")
    }
}