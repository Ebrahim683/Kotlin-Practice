package com.example.kotlincodepractices

import androidx.recyclerview.widget.RecyclerView

fun main() {
    println("Hello Kotlin")

//    val resource: Resource<Any> = Resource<Any>("Ebrahim", "senior", 20, State.MANAGER)
//    when (resource.state) {
//        State.MANAGER -> {
//            val manager = Resource.manager("Ebrahim", "HR Manager")
//            println("Manager Details : $manager")
//            println("Hi ${resource.name}!! You are the ${resource.post} Manager of this company")
//        }
//        State.DEVELOPER -> {
//            val developer = Resource.developer("Ebrahim", "Senior", 20)
//            println("Developer Details : $developer")
//            println(
//                "Hi ${resource.name}!! You are the ${resource.post} Developer of this " +
//                        "company, You age is ${resource.age}"
//            )
//        }
//    }


    print("Enter number : ")
    val number = Integer.valueOf(readLine())

    when (number) {
        1 -> {
            println("Developer")
            response(Resource.developer("Ebrahim", "Senior", 20))
        }
        2 -> {
            println("Manager")
            response(Resource.manager("Ashraf", "HR Manager"))
        }
        else -> println("Error input")
    }

}

fun response(resource: Resource<Any>) {

    when (resource.state) {
        State.MANAGER -> {
            val manager = Resource.manager("Ashraf", "HR Manager")
            println("Manager Details : $manager")
            println("Hi ${resource.name}!! You are the ${resource.post} Manager of this company")
        }
        State.DEVELOPER -> {
            val developer = Resource.developer("Ebrahim", "Senior", 20)
            println("Developer Details : $developer")
            println(
                "Hi ${resource.name}!! You are the ${resource.post} Developer of this " +
                        "company, You age is ${resource.age}"
            )
        }
    }
}

enum class State() {
    MANAGER,
    DEVELOPER
}

data class Resource<out T>(var name: Any?, var post: Any?, var age: Any?, var state: State) {
    companion object {
        fun <T> manager(name: T, post: T): Resource<T> =
            Resource(name = name, post = post, age = null, state = State.MANAGER)

        fun <T> developer(name: T, post: T, age: T): Resource<T> = Resource(
            name = name, post = post,
            age = age, state = State.DEVELOPER
        )
    }
}