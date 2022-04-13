<h2>Mars Rover Kata</h2>
<h3>TDD Approach</h3>

You are working in an Engineering Squad for the Melody Mars Mission, tasked with designing software to manage robots and cool vehicles for
space exploration!<br>
<h3>Your Task</h3>
<h4>Setting the Scene</h4>

You have been asked to create a program to move rovers around the surface of Mars!
The surface of Mars is represented by a Plateau, you can make the assumption that the Plateau is a square/rectangular grid for the purpose of
this task. Rovers navigate the Plateau so they can use their special cameras and robot arms to collect samples back to Planet Earth
Representation of a Rover’s Position on the Plateau. The Plateau is divided into a grid. A Rover’s position is represented by x and y co-ordinates and the letters N, S, W, E to represent North,
South, West, East (the four cardinal compass points) respectively.<br>
<h4>Example</h4>
0 0 N - This means the Rover is at the bottom-left corner facing in the North direction.<br>
<h4>Instructing a Rover to Move Around the Plateau</h4>
To move a Rover around the Plateau, a string of letters is sent to a Rover. Here are the letters and their resultant action:
<h4>Letter Action</h4>
L - Spins the Rover 90 degrees Left without moving from the current coordinate point.<br>
R - Spins the Rover 90 degrees Right without moving from the current coordinate point.<br>
M - Moves the Rover forward by one grid point, maintaining the same heading (i.e. from where the Rover is facing (its orientation)). 
N.B. Assume that the square directly North from (x, y) is (x, y+1).

<h3>Inputs into the Program</h3>

<h4>First Line of Input to the Program</h4>
The first line inputted into the program represents the upper-right coordinates of the Plateau.<br><br>
5 5<br><br>
This Plateau has maximum (x, y) co-ordinates of (5, 5).<br>
N.B. Assume that the lower-left coordinates is (0, 0).<br>
<h4>Subsequent Lines of Input into the Program - Input to Rovers</h4>
This represents the instructions to move the rovers.<br><br>
Each rover receives two lines of input.<br><br>
**First Line of Input to a Rover**<br>
The Rover’s position is represented by two integers representing the X and Y coordinates and a letter representing where the Rover is facing (its
orientation).<br><br>
1 2 N<br><br>
**Second Line of Input to a Rover**<br>
A string of letters representing the instructions to move the Rover around the Plateau.<br><br>
**Movement Rules**<br>
Rovers move sequentially, this means that the first Rover needs to finish moving first before the next one can move.<br><br>
**Output**<br>
For each Rover, the output represents its final position (final coordinates and where it is facing).<br><br>
<h4>Example Test Case</h4>
Lines of Input to the Program:<br>
5 5<br>
1 2 N<br>
LMLMLMLMM<br>
3 3 E<br>
MMRMMRMRRM<br><br>
Expected Output:<br>
1 3 N<br>
5 1 E<br>


<h4>Your Solution</h4>
After creating an initial [UML diagram](docs/MarsRoverUML.drawio) to outline my OOP approach, I began Test-Driven Development (TDD) to build a solution in Java. In the course of this, development became a balancing 
act between following the UML and adhering to TDD with early parts of the TDD following my [UML](docs/MarsRoverUML.png) closely while latter stages began to differ slightly. The code was split into 3 classes and refactored where possible. 
<h4>Assumptions</h4>
For the purposes of this project, I have assumed there are only 2 rovers, although I have coded it to easily allow for more. The Plateau is assumed to be rectangular.
<h4>Future Thoughts</h4>
The ProgramController class could be modified to call additional types of vehicle classes. The code does not check for obstacles but this will be added. Checks for the edge of the plateau will also be added. Functionality to allow the Rover's to take photographs and collect samples can be added. I need to identify further refactoring opportunities and 
search for ways to improve code efficiency. Once I've added the edge of plateau checks, I will investigate how to support a different shaped Plateau.
