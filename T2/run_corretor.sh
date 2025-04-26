cd ./analisador-sintatico-t2
mvn clean package
java -jar ../corretor/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar  "java -jar ./target/analisador-sintatico-t2-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc ../corretor/temp/ ../corretor/casos-de-teste/ "790729" -t2
