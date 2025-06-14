package br.ufscar.dc.compiladores.analisador.semantico.t5;

class EntradaTabelaDeSimbolos {
    public enum Tipos {
        INT, REAL, CADEIA, LOGICO, INVALIDO, REG, VOID, ARRAY
    }

    public enum Estrutura {
        VAR, CONST, PROC, FUNC, TIPO
    }
    
    String name;
    Tipos tipo;
    Estrutura estrutura;

    public EntradaTabelaDeSimbolos(String name, Tipos tipo, Estrutura estrutura) {
        this.name = name;
        this.tipo = tipo;
        this.estrutura = estrutura;
    }

    public String getNome() {
        return name;
    }

    public Tipos getTipo() {
        return tipo;
    }
}