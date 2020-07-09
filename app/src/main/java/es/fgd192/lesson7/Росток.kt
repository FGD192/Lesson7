package es.fgd192.lesson7

import android.util.Log

class Росток:Растения() {
    override fun makeSound() {
        Log.d("_ _ _ _", расти + " " + "Росток")
    }
}