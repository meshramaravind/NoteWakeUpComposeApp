package com.arvind.notewakeupcomposeapp.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
