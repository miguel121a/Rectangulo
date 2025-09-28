package com.example.rectangulo.Contrato

interface Rectangulocontract {
    interface Rectangulomodel{
        fun CalcularArea(base: Double, altura: Double): Double
        fun CalcularPerimetro(base: Double, altura: Double): Double
        fun VerificarRectangulo(base: Double, altura: Double): Boolean

    }
    interface RectanguloPresentador{
        fun CalcularArea(base: Double, altura: Double)
        fun CalcularPerimetro(base: Double, altura: Double)
        fun VerificarRectangulo(base: Double, altura: Double): Boolean
    }
    interface RectanguloVista{
        fun ShowARea(Area: Double);
        fun ShowPerimetro(Perimetro: Double);
        fun ShowError();
    }
}
