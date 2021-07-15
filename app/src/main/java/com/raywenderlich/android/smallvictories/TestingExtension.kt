package com.raywenderlich.android.smallvictories

import android.os.Build
import android.support.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun String.countVowels(string : String ) : HashMap<Char, Int> {
    val hashMap = HashMap<Char, Int>()
    string.forEach {
        if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
            hashMap.put(it, hashMap.getOrDefault(it, 0) + 1)
        }
    }
    return hashMap
}

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>) {

    val string = "Hello David williams"

    print(string.countVowels(string))


}