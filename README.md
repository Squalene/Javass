# Javass
A single player or multiplayer game of a card game called Jass  
Jass is a traditional swiss card game whose rules can be found [here](https://en.wikipedia.org/wiki/Jass)

## Game Modes
To play the game, run the Play.java in your favourite IDE. 

### Single-player
You will be offered the choice to play a single-player game where you will play against 
opponents of adjustable strength that are simulated using a Monte Carlo tree search algorithm.
### Multi-player
You can also play remotely with friends, provided that they have the same program running on their computer and you know their IP adress.

## Sharing
All of these project dependencies are included in the pom.xml file using Maven dependencies.
To create a JAR containing all the dependencies and easily share it with a friend, you can run ```mvn clean compile assembly:single```
