package com.example.kotlincodepractices

fun main() {

    val developer = Developer()

    developer.programming()
    developer.fontEnd(FontEnd("Font End Developer"))

}

class Developer : Programmer, DeveloperType {

    override var language: String
        get() = "Kotlin"
        set(value) {}

    override var platform: Platform
        get() = Platform("Android")
        set(value) {}

    override fun fontEnd(fontEnd: FontEnd) {
        super.fontEnd(fontEnd)
    }

    override fun backEnd(backEnd: BackEnd) {
        super.backEnd(backEnd)
    }

}

data class Platform(var platform: String)
data class FontEnd(var fontEnd: String)
data class BackEnd(var backEnd: String)

interface Programmer {
    var language: String
    var platform: Platform

    fun programming() {
        println(language + platform)
    }
}

interface DeveloperType {
    fun fontEnd(fontEnd: FontEnd) {
        println(fontEnd)
    }

    fun backEnd(backEnd: BackEnd) {
        println(backEnd)
    }
}