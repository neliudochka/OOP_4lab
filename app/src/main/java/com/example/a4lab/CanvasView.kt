package com.example.a4lab

import android.content.Context
import android.graphics.*
import android.view.MotionEvent
import android.view.View
import com.example.a4lab.shape.*

class CanvasView(context: Context) :  View(context) {

    private var motionTouchEventX = 0f
    private var motionTouchEventY = 0f


    override fun onDraw(canvas: Canvas) {

        super.onDraw(canvas)

        for (i in shapes) {
            i.show(canvas)
            if(i.finished) {
                i.showFinal(canvas)
            }
            if(i.filled) {
                i.fill(canvas)
            }
        }

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        motionTouchEventX = event.x
        motionTouchEventY = event.y

        when (event.action) {
            MotionEvent.ACTION_DOWN -> touchStart()
            MotionEvent.ACTION_MOVE -> touchMove()
            MotionEvent.ACTION_UP -> touchUp()
        }
        return true
    }

    private fun touchStart() {
        invalidate()
        editor.onLBDown(motionTouchEventX, motionTouchEventY)
    }

    private fun touchMove() {
        invalidate()
        editor.onMouseMove(motionTouchEventX, motionTouchEventY )
    }


    private fun touchUp() {
        editor.onLBUp()
        invalidate()
    }

    private val shapes = mutableListOf<Shape>()

//4
    private var editor: MyEditor = MyEditor(shapes).start(PointShape(PaintOptions))

    fun startMyEditor(shapeType: Shape) {
        editor = editor.start(shapeType)
    }
}