package com.itocc.icampuspass

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform