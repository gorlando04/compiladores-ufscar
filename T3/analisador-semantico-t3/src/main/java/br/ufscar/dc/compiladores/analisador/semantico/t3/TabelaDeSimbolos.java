package br.ufscar.dc.compiladores.analisador.semantico.t3;

import java.util.HashMap;

import br.ufscar.dc.compiladores.analisador.semantico.t3.EntradaTabelaDeSimbolos.Tipos;

public class TabelaDeSimbolos {

    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;

    public TabelaDeSimbolos() {
        tabelaDeSimbolos = new HashMap<>();
    }

    public void inserir(String nome, Tipos tipo){
        EntradaTabelaDeSimbolos input = new EntradaTabelaDeSimbolos(nome, tipo);
        tabelaDeSimbolos.put(nome, input);
    }

    public Tipos verificar(String nome){
        return tabelaDeSimbolos.get(nome).tipo;
    }

    public boolean possui(String nome){
        return tabelaDeSimbolos.containsKey(nome);
    }

}
