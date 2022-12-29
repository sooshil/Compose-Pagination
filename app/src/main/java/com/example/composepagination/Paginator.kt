package com.example.composepagination

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}