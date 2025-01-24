#!/bin/bash

rm -rf ./classes/
javac -classpath ./classes -sourcepath ./src -d ./classes ./src/fr/insarouen/iti/prog/aventure/elements/*.java
javac -classpath ./classes -sourcepath ./src -d ./classes ./src/fr/insarouen/iti/prog/aventure/elements/objets/*.java
javac -classpath ./classes -sourcepath ./src -d ./classes ./src/fr/insarouen/iti/prog/aventure/elements/structure/*.java
javac -classpath ./classes -sourcepath ./src -d ./classes ./src/fr/insarouen/iti/prog/aventure/*.java

