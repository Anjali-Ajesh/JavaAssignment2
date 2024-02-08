package Assignment2Part2;
public class Main {
    public static void main(String[] args) {
        Assignment2Part2.Input inputHandler = new Assignment2Part2.Input();
        int[] arr = inputHandler.getInputArray();
        Assignment2Part2.NearestNeighbor finder = new Assignment2Part2.NearestNeighbor();
        int nearestIndex = finder.findNearest(arr);
        System.out.println("Index of the first number with the smallest distance to its neighbor: " + nearestIndex);
    }
}
