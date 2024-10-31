package dev.sondre

import io.quarkus.logging.Log
import io.quarkus.runtime.Quarkus
import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import jakarta.inject.Inject

fun main() {
   Quarkus.run(Job::class.java)
}

@QuarkusMain
class Job : QuarkusApplication {

    @Inject
    lateinit var w: Worker

    override fun run(vararg args: String?): Int {
        Log.info("Starting to do work, I promise!")
        w.doWork()
        return 0
    }
}
