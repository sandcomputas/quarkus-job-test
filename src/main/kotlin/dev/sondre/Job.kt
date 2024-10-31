package dev.sondre

import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain

fun main() {
   Quarkus.run(Job::class.java)
}

@QuarkusMain
class Job : QuarkusApplication {
    override fun run(vararg args: String?): Int {
        println("doing something useful, I promise!")

        return 0
    }
}
