package com.example.apipractice.json

data class Body(
    val items: List<ItemData>,
    val numOfRows: Int,
    val pageNo: Int,
    val totalCount: Int
)