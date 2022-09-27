package com.pix.androidenv.ext

import android.content.Context
import android.content.res.Resources
import android.util.TypedValue

fun Context.screenHeight(): Int  =
    applicationContext.resources.displayMetrics.heightPixels
fun Context.screenWidth(): Int  =
    applicationContext.resources.displayMetrics.widthPixels

inline var Int.dp:Int
    get() {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            this.toFloat(),
            Resources.getSystem().displayMetrics
        ).toInt()
    }
    set(value) {}


inline var Float.dp:Int
    get() {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            this,
            Resources.getSystem().displayMetrics
        ).toInt()
    }
    set(value) {}

inline var Int.sp:Int
    get() {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            this.toFloat(),
            Resources.getSystem().displayMetrics
        ).toInt()
    }
    set(value) {}


inline var Float.sp:Int
    get() {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            this,
            Resources.getSystem().displayMetrics
        ).toInt()
    }
    set(value) {}
