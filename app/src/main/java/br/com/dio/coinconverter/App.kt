package br.com.dio.coinconverter

import android.app.Application
import android.app.Presentation
import br.com.dio.coinconverter.data.di.DataModules
import br.com.dio.coinconverter.domain.di.DomainModule
import br.com.dio.coinconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

//Classe para iniciar o 'Koin', biblioteca para injetar as dependĂȘncias do projeto
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}