package com.example.a4lab

import com.example.a4lab.shape.Shape
import com.example.a4lab.shape.ShapeAdder

class MyEditor (val shapes: MutableList<Shape>) {
    private lateinit var currentShape: Shape

     fun start (shape: Shape): MyEditor {
         currentShape = shape
         return this
     }

    fun onLBDown(x: Float, y: Float) {
        currentShape = currentShape.createNew()
        currentShape.setStartCoords(x, y)
    }

    fun onLBUp() {
        currentShape.setFillFlag()
        currentShape.setFinishedFlag()
        ShapeAdder.addShape(currentShape, shapes)
    }

    fun onMouseMove(x: Float, y: Float) {
        if (shapes.contains(currentShape))
            shapes.removeAt(shapes.lastIndex)

        currentShape.setEndCoords(x, y)
        ShapeAdder.addShape(currentShape, shapes)
    }
}