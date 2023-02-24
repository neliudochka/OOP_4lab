package com.example.a4lab.shape

import android.graphics.Canvas
import com.example.a4lab.PaintOptions

class EllipseShape (val paintOptions: PaintOptions): Shape(paintOptions) {

    override fun show(canvas: Canvas) {
        canvas.drawOval(x1, y1, x2, y2, PaintOptions.inProgress)
    }

    override fun showFinal(canvas: Canvas) {
        canvas.drawOval(x1, y1, x2, y2, PaintOptions.final)
    }

    override fun fill (canvas: Canvas) {
        canvas.drawOval(x1, y1, x2, y2, PaintOptions.fillEllipse)
    }

    //for 4 lab
    override fun createNew(): EllipseShape {
        return EllipseShape(paintOptions)
    }
}