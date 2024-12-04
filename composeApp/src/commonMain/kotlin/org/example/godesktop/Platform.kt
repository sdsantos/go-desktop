package org.example.godesktop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform