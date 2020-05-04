package com.luiz.mobilechallenge.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.luiz.mobilechallenge.model.dao.CurrencyDao
import com.luiz.mobilechallenge.model.data.Currency

@Database(entities = arrayOf(Currency::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun currencyDao(): CurrencyDao
}