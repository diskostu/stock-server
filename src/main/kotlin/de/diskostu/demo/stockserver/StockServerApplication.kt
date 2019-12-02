package de.diskostu.demo.stockserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockServerApplication

fun main(args: Array<String>) {
    runApplication<StockServerApplication>(*args)
}
