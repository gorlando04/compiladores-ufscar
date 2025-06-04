cd ./analisador-semantico-t5
mvn clean package
java -jar ../corretor/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar  "java -jar ./target/analisador-semantico-t5-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc ../corretor/temp/ ../corretor/casos-de-teste/ "790728" -t5
