package com.example.rectangulo

import com.example.rectangulo.Presentador.Cls_RectanguloPresenter
import com.example.rectangulo.Presentador.Cls_RectanguloView

fun main()
{
    println(".... Calculadora de Rectangulos...");
    val  vista = Cls_RectanguloView()
    val presenter = Cls_RectanguloPresenter(vista);
    vista.setPresenter(presenter)
    vista.inicio()
}