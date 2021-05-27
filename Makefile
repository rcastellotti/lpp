clean: 
	find . -type f -path "./lpp/*/*" -name "*.class" -exec rm -f {} \;

test: clean
	javac lpp/Main.java
	python tests.py
	find . -type f -path "./lpp/*/*" -name "*.class" -exec rm -f {} \;