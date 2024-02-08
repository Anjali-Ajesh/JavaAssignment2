
1. Main class:
   - This class serves as the entry point for the program.
   - It creates instances of the `Input` and `NearestNeighbor` classes to handle input and find the nearest neighbor, respectively.
   - It prompts the user to input an array of integers, finds the index of the first number with the smallest distance to its neighbor, and prints the result.

2. Input class:
   - This class handles input from the user.
   - It prompts the user to enter the number of elements in the array and then prompts for each element.
   - It returns the array of integers entered by the user.

3. NearestNeighbor class:
   - This class contains the logic to find the index of the first number with the smallest distance to its neighbor in an array of integers.
   - It has a method `findNearest` that takes an array of integers as input and returns the index of the first number with the smallest distance to its neighbor.
   - It iterates through the array, calculates the absolute difference between each pair of neighboring numbers, and keeps track of the minimum distance and corresponding index.
