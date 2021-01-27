[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3978876&assignment_repo_type=AssignmentRepo)
# N5-FootballPitchCheck

The football league needs a system to check that a football pitch meets the size requirements.

To be an allowable playing surface the pitch must be:

at least 90m and at most 120m long\
At least 45m and at most 90m wide

The program should allow them to re enter the values if the diminssions are not legal until legal set of dimensions if entered

### The Task

Wrtie a program that asks the user to enter the length and width of a football pitch then:\
if they are both valid display a message saying so\
if they are invalid ask them to enter the length and width again\
keep going until the dimensions entered are valid

This program uses a conditional loop (while loop) to keep going until a condition is met

**example of uses**

String password = Keyboard.getText("Please enter the password");\
while (password.equals("ComputingRocks")) {\
     password = Keyboard.getText("That is incorrect! Try the password again");\
}

will keep displaying That is incorrect! Try the password again until the correct password is entered


## Your Task

Write the Java in Main.java to take in the length and width adn keep going until they are valid

## The Algorithm Design

**Step 1:** ask user for the length\
**Step 2:**	ask user for the width\
**Step 3:** conditional loop while length or width is invalid\
**Step 4:**	display these dimenstions are invalid\
**Step 5:** ask user for the length\
**Step 6:**	ask user for the width\
**Step 7:** End loop\
**Step 8:** display "the dimensions of width " and the value of width and " and length " and the value of length and " are valid dimensions"


Test your program and submitt through a version control commit!

## Extensions

1. Make it check the dimensions indicidually so that you can say which one is wrong
2. there is an extra rule that the pitches must have a ratio 1m width to 1.57m length add this in to you check
