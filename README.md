# Tortoise & Hare Race Simulation
Date: 1/7/2021<br>

## Description
Our contenders begin the race at square 1 of 70 squares. Each square represents a possible position along the race course. The finish line is at square 70. The first contender to reach or pass square 70 is rewarded with a pail of fresh carrots and lettuce. The course weaves its way up the side of a slippery mountain, so occasionally the contenders lose ground.
A clock ticks once per second. With each tick of the clock, your application should adjust the position of the animals according to the rules in Fig. 7.32. Start each animal at position 1 (the “starting gate”). If an animal slips left before square 1, move it back to square 1.

<img> ![image](https://github.com/iLightzZ/Tortoise_and_Hare_Race/assets/83619548/baf14ff5-4aba-4fed-9a49-14caa545f2a6)<br>


Generate the percentages in Fig. 7.32 by producing a random integer i in the range 1 ≤ i ≤ 10. For the tortoise, perform a “fast plod” when 1 ≤ i ≤ 5, a “slip” when 6 ≤ i ≤ 7 or a “slow plod” when 8 ≤ i ≤10. Use a similar technique to move the hare.
Begin the race by displaying "BANG !!!!! AND THEY'RE OFF !!!!!"
Then, for each tick of the clock (i.e., each repetition of a loop), display a 70-position line showing the letter T in the position of the tortoise and the letter H in the position of the hare. Occasionally, the contenders will land on the same square. In this case, the tortoise bites the hare, and the application should display OUCH!!! beginning at that position. All output positions other than the T, the H or the OUCH!!! (in case of a tie) should be blank.
After each line is displayed, test for whether either animal has reached or passed square 70. If so, display the winner and terminate the simulation. 

If the tortoise wins, display "TORTOISE WINS!!! YAY!!!"
If the hare wins, display "Hare wins. Yuch." 
If both animals win on the same tick of the clock, you may want to favor the tortoise (the “underdog”), or you may want to display "It's a tie."
If neither animal wins, perform the loop again to simulate the next tick of the clock. 
When you’re ready to run the application, assemble a group of fans to watch the race!

