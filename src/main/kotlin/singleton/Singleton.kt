package org.example.singleton

object DatabaseManager {

    val databaseName = "_databaseName"

    fun connect() {
        println("Connecting to $databaseName")
    }

    fun disconnect() {
        println("Disconnecting from $databaseName")
    }
}

fun main(){
    //to connect
    DatabaseManager.connect()

    //to disconnect
    DatabaseManager.disconnect()
}