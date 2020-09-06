package com.gihut.bazpiyo.clikotlin

import java.lang.RuntimeException


fun main(args: Array<String>) {
    val list = args.toList()
    if (list.size != 2) {
        throw RuntimeException("引数指定が異なります。例: 1 2")
    }
    val first = list.first().toIntOrNull()
    val sec = list.last().toIntOrNull()
    if (first == null || sec == null) {
        throw RuntimeException("引数指定に数値以外の値が指定されています。")
    }
    println(first + sec)
}