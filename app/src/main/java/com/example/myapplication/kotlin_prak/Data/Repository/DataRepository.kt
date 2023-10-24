package com.example.kotlin_prak.Data.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataRepository {
    private val data = MutableLiveData<String>()

    fun getData(): LiveData<String> {
        // загрузка данных из источника данных
        return data
    }
}