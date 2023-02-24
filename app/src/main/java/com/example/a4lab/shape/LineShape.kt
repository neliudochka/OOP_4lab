package com.example.a4lab.shape

import android.graphics.Canvas
import com.example.a4lab.PaintOptions

open class LineShape (open var paintOptions: PaintOptions): Shape(paintOptions) {

    override fun show(canvas: Canvas) {
        canvas.drawLine(x1, y1, x2, y2, PaintOptions.inProgress)
    }

    override fun showFinal(canvas: Canvas) {
        canvas.drawLine(x1, y1, x2, y2, PaintOptions.final)
    }

    //for 4 lab
    override fun createNew(): LineShape {
        return LineShape(paintOptions)
    }
}