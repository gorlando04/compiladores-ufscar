cd ./analisador-lexico-t1
mvn clean package
java -jar ../corretor/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar  "java -jar ./target/analisador-lexico-t1-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc ../corretor/temp/ ../corretor/casos-de-teste/ "790729" -t1
