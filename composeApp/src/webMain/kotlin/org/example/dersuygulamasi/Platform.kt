package org.example.dersuygulamasi

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform