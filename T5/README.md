# T5-Compiladores

## Integrantes ##

- **Gabriel Meirelles Carvalho Orlando** – RA: 790728  

Para conseguirmos executar o código é necessário que algumas dependências estejam em uma versão específica.

## Dependências e Versões

Para garantir a correta execução do projeto, é necessário utilizar as seguintes versões de bibliotecas e ferramentas:

- **Java**: 11.0 ou superior  
- **JUnit**: 4.11  
- **ANTLR**: 4.11.1  
- **maven-clean-plugin**: 3.1.0  
- **maven-resources-plugin**: 3.0.2  
- **maven-compiler-plugin**: 3.8.0  
- **maven-surefire-plugin**: 2.22.1  
- **maven-jar-plugin**: 3.0.2  
- **maven-install-plugin**: 2.5.2  
- **maven-deploy-plugin**: 2.8.2  
- **maven-site-plugin**: 3.7.1  
- **maven-project-info-reports-plugin**: 3.0.0  

---

## Opção 1 – Execução Manual

Para compilar o projeto, execute o seguinte comando no diretório raiz (nesse caso, para acessar o diretório raiz digite **cd analisador-semantico-t5/**:

```bash
mvn package
```

Após a compilação, será gerado um arquivo .jar. Para executar o corretor e processar os arquivos de entrada e saída, utilize:

```bash
java -jar analisador-semantico-t5/target/analisador-semantico-t5-1.0-SNAPSHOT-jar-with-dependencies.jar <arquivo_entrada.txt> <arquivo_saida.txt>
```
**OBS: O arquivo com os casos de teste foi fornecido pelo professor André Backes.**

## Opção 2 – Execução com Script

Foi criado um script chamado run_corretor.sh, que automatiza a compilação e execução do projeto.

Para utilizá-lo, execute no diretório raiz:

```bash
./run_corretor.sh
```

**OBS: Caso ocorra um erro de permissão, conceda permissão de execução com:**

```bash
chmod +x run_corretor.sh
```

O resultado será salvo no arquivo de saída informado como parâmetro na execução. Esse arquivo conterá as correções ou informações processadas com base no conteúdo de entrada.


