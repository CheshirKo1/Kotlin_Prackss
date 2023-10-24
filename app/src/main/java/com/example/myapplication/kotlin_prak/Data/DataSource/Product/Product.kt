package com.example.kotlin_prak.Data.DataSource.Product

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Product(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,

    )