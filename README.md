The prompt: 

The following problem has been adapted from the problem of the same name from the Quinnipiac Computing Competition (2018).

The picture, (see this problem under Ternary Models in your online textbook), shows a 15-meter-long log that is populated with green and black ants. These ants, when present, are always positioned at 1 meter increments on the log. In the example shown, there are green ants at positions 0, 6 and 9 on the log while there are black ants at positions 3 and 13. Two ants cannot occupy the same position on the log.

The green and black ants do not like each other and, therefore, will fight unless separated by sticks as shown in the picture, below. For this case, only three sticks are needed to separate the ants by color. The sticks can be placed anywhere between the ants and need not be positioned at meter increments on the log.
Your assignment is to write a computer program that calculates how many sticks are needed to separate the green and black ants. The format for the input file is shown below.

1

15

0 6 9

3 13

The first line in the file contains number of test cases.
The second line contains the length of the log. The third line contains the positions of the green ants. The fourth line contains the positions of the black ants. With this information, your program must produce an integer that describes the smallest number of sticks required to separate the ants by color. For the example given, the right answer would be 3.

HINTS: During the original programming contest at which this problem was given, the combination of the time pressure and other competitive stresses led most students to build overly complicated models for this problem. But you are given a huge head start because you are being told that this problem can be solved fairly simply with a trinary model: Note that each position on the log either contains a green ant, a black ant, or no ant at all.
