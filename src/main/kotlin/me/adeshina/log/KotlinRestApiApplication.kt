package me.adeshina.log

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class KotlinRestApiApplication

fun main(args: Array<String>) {
	runApplication<KotlinRestApiApplication>(*args)
}
