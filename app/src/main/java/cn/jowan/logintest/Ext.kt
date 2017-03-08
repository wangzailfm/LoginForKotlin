package cn.jowan.logintest

import android.util.Log

fun loge(tag: String, content: String?) {
    Log.e(tag, content ?: tag)
}