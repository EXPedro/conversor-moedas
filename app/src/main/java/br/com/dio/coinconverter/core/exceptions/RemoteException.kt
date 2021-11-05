package br.com.dio.coinconverter.core.exceptions

//Tratamento de exceções 'padrão' do app
class RemoteException(override val message: String) : Throwable()