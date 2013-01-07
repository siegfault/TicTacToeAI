# Makefile for TicTacToeAI
# Michael Siegfried
# 1/6/13

make:
	javac Game.java Player.java Board.java
all: make
run: make
	java Game
clean:
	rm -f Game *~ *.class