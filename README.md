# codingExerciseSportradar
 Coding Exercise - Sportradar
 
Hello! I'm Jesus Torres and once finished the exercise let me explain it and some decision I have made. The code is divided into 3 classes:

 - Game.java
 - Scoreboard.java
 - Main.java
 
The Game class is used to define the entity of a game. Which have a home team, an away team, a home score and away score. It is also possible to add a start date for the start of a game, that will help to sort the games when summarize them. But in my exercise i decided not to include that date because found another way to compare the results and get the expected outcome.

That class, Game.java, also include getters and setters for the attributes and implements CompareTo. The criteria for the comparison is the total goals scored in a game. So an easy way to solve is summing the value of the home score plus away score.

Moreover,in the Scoreboard class we have defined the principal methods that make the app functional. I have decided to make the outcome as a list. So when a game is started, it is added to the list. Here is a tricky solution. I have made it in a way that every game is added in first position of the list. Due to that, the list is always sorted by the most recent added game.

Then, finish game methods can be found. It removes a certain game from the list. Further, there is the update score method, which looks for a game and update the score with given data. In that case, I have decided to code it in a more functional programation, but it can also be done with streams of Java 8.

At the end of this class, we can find the summary method. It is easy solved with a stream, sorting the list, which is a list of games and games have a comparator. So they are sorted by the comparator by the total score of the game and by recent added by the way we added them to the list. This method could be done without the Java 8 streams by iterating the list and showing the games.

About the main class, there is the same data that can be found in the statement of the exercise. We can see that with the same total score, the game most recently added is highest in the list. I have also added another game, Japan vs Portugal, where we can easily see that fact. Spain vs Brazil game has 12 goals, the same as Japan vs Portugal, but the last one is most recently added, so it is shown first. The same happens with Uruguay vs Italy game, which is started later than Spain vs Brazil. But it he last example Uruguay vs Italy was removed.

Finally, in "src/test/java" we can find the JUnit Tests.java class where I have tested all Scoreboard methods twice. Once with the expected result with correct data and then with wrong data that will make the app crash or show an incorrect data, so I have controlled them with some exceptions and conditions.

Coverage of the code is 72,3%. It could be more, but I did not consider useful doing test for getters and setters method in Game class.
