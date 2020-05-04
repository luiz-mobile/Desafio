package com.luiz.mobilechallenge.viewmodel.factory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.luiz.mobilechallenge.model.datasource.ICurrencyDataSource
import com.luiz.mobilechallenge.viewmodel.CurrencyListViewModel

class CurrencyListViewModelFactory constructor(private val repository: ICurrencyDataSource,
                                               private val application: Application):
                                                ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        with(modelClass){
            when{
                isAssignableFrom(CurrencyListViewModel::class.java) ->
                    CurrencyListViewModel(repository, application)
                else ->
                    throw IllegalArgumentException("Classe desconhecida.")
            }
        } as T
}