// THis is responsible for drawing

package com.example.mad_assignment_2_22012022014

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import com.example.mad_assignment_2_22012022014.MainActivity.Companion.PaintBrush
import com.example.mad_assignment_2_22012022014.MainActivity.Companion.path
import kotlinx.coroutines.joinAll

class PaintView:View {

// it is responsiblw for hight and width of our canvas with respect to parent layout
    var params:ViewGroup.LayoutParams?=null
    companion object{

        //It store all the path in screen
        var pathList = ArrayList<Path>()

        // we take colour list bcz we have user multiple color in this project.
        var colorList = ArrayList<Int>()

        // This holds the default value of color on screen and we set defalut color is black
        var currnetBrush = Color.BLACK
    }

        constructor(context: Context) : this(context, null){
            init()
        }
        constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0){
            init()
        }

        constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
                init()
        }

    // We have to inilize to our strok or path that we have actually draw .
    private  fun init(){
//        this thing making for a making texture smooth of our stocks
        PaintBrush.isAntiAlias = true
        PaintBrush.color= currnetBrush
        PaintBrush.style = Paint.Style.STROKE
//        strock join is any end of path so if you set it round the any path is round finish
        PaintBrush.strokeJoin= Paint.Join.ROUND
        PaintBrush.strokeWidth=8f
//        This thing we initialize to our brush
        params=ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
    }

//    We have to register that moment of fingure on the screen
    override fun onTouchEvent(event: MotionEvent): Boolean {
        var x=event.x
        var y=event.y

    when(event.action){
        MotionEvent.ACTION_DOWN->{
            path.moveTo(x,y)
            return true
        }
        MotionEvent.ACTION_MOVE->{
            path.lineTo(x,y)
            pathList.add(path)
            colorList.add(currnetBrush)
        }
        else  -> return false
    }
    postInvalidate()
    return false
    }


    // When user draw something on screen
    override fun onDraw(canvas: Canvas) {
        for(i in pathList.indices){
            PaintBrush.setColor(colorList[i])
            canvas.drawPath(pathList[i], PaintBrush)
            invalidate()
        }
    }
}