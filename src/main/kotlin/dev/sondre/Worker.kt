package dev.sondre

import io.quarkus.logging.Log
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class Worker {

    fun doWork() {
        for (i in 1..10) {
            Log.info("working...")
            Thread.sleep(1000)
        }
        Log.info("done working for now, I've had enough")
    }
}
