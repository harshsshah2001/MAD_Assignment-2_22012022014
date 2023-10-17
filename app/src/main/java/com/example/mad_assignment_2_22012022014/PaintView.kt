package com.example.mad_assignment_2_22012022014

import android.content.Context
import android.util.AttributeSet
import android.view.View

class PaintView:View {

    class KotlinView : View {

        constructor(context: Context) : this(context, null)
        constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

        constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        }

    }
}