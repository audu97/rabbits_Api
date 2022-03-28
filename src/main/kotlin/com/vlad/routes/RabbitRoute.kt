package com.vlad.routes

import com.vlad.data.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.43.53:8080"

private val rabbits = listOf(
    Rabbit("carl", "a cute brown rabbit","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("emma", "emma likes to eat apples","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("florian", "florian is always hungry","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("federico", "federico likes to climb mountains","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("Gina", "Gina is a true beauty","$BASE_URL/rabbits/rabbit1.jpg"),
)

fun Route.randomRabbit(){
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}