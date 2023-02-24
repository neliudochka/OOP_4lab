package com.example.a4lab.shape

import android.graphics.Canvas
import com.example.a4lab.PaintOptions


open class RectShape (open val paintOptions: PaintOptions): Shape(paintOptions) {
    private var startx = x1
    private var endx = x1
    private var starty = y1
    private var endy = y2

    override fun show(canvas: Canvas) {
        startx = x1 - Math.abs(x1 - x2)
        endx = x1 + Math.abs(x1 - x2)
        starty = y1 - Math.abs(y1 - y2)
        endy = y1 + Math.abs(y1 - y2)

        canvas.drawRect(startx,starty, endx, endy, PaintOptions.inProgress)
    }

    override fun showFinal(canvas: Canvas) {
        canvas.drawRect(startx,starty, endx, endy, PaintOptions.final)
    }

    //for 4 lab
    override fun createNew(): RectShape {
        return RectShape(paintOptions)
    }

}