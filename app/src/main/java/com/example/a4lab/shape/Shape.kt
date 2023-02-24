package com.example.a4lab.shape

import android.graphics.Canvas
import com.example.a4lab.PaintOptions

abstract class Shape (paintOptions: PaintOptions) {

    protected var x1: Float = 0f
    protected var y1: Float = 0f
    protected var x2: Float = 0f
    protected var y2: Float = 0f
    var filled:Boolean = false
    var finished:Boolean = false

    open fun setStartCoords(x: Float, y: Float) {
        x1 = x
        y1 = y
    }

    fun setEndCoords(x: Float, y: Float) {
        x2 = x
        y2 = y
    }


    open fun show(canvas: Canvas) {

    }

    open fun showFinal(canvas: Canvas) {

    }

    open fun fill(canvas: Canvas) {
    }

    fun setFinishedFlag () {
        finished = true
    }

    fun setFillFlag () {
        filled = true
    }

    //for 4 lab

    abstract fun createNew(): Shape
}