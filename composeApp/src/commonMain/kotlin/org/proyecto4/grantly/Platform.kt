package org.proyecto4.grantly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform