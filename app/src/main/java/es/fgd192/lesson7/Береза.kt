package es.fgd192.lesson7

import android.util.Log

class Береза:Растения() {
    override fun makeSound() {
        var text = расти + " " + "Береза"
        Log.d("_ _ _ _", text)
    }
}