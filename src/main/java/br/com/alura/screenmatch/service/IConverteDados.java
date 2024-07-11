package br.com.alura.screenmatch.service;

public interface IConverteDados {

    //Uso do Generics, que está recebendo um Json para ser usado na outra classe
    <T> T obterDados(String json, Class<T> classe);
}
