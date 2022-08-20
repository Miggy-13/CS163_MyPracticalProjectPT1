Here is the [javadoc](https://www.cs.colostate.edu/~cs163/javadoc/practical/knightfight/allclasses-index.html) I used in class during the laboratory session to complete my work.

## Implemented Features

1. File Reading and Saving  
   Program data should be stored in CSV files, that will be read at the launch of the program. There
   should also be the feature to save the current progress of the knights. There are both
   default files, and the ability to pass in files via the command line. 
2. Knights  
   Knights gain experience defeating monsters, and there can only be four active knights on a quest at a time. 
3. Fortunes / Bonus Cards  
   Before knights start a quest, a random fortune is assigned to them. This fortune provides bonuses or even
   minuses if the fortune is bad. 
4. MOBS / Monsters  
   Knights will have random encounters with 1-4 monsters (depending on the number of active knights).
5. Team Management  
   When not on a quest, players should be able to view information on each knight, and manage their
   active knight pool. Knights never "die", they are just defeated and return to the normal pool.
6. Text-based game  
   For now, the entire game is text based to the System console (System.out / System.in), however, it must
   be done in a way that can easily be replaced. 