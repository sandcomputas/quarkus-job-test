package dev.sondre

import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class Worker {

    fun doWork() {
        for (i in 1..10) {
            println("working...")
            Thread.sleep(1000)
        }
        println("done working for now")
    }
}
