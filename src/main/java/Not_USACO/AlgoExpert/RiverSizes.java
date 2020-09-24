package Not_USACO.AlgoExpert;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * You're given a 2 dimensional array with 1's and 0's.
 * Each 0 represents land and each 1 represents a river.
 * A river consists of any number of 1's horizontally or vertically adjacent (it can be 1 long).
 * return an array of all the different sizes of rivers.
 */

public class RiverSizes {

    public static void main(String[] args){
        List<Integer> sizes = riverSizes(new int[][] { {1, 0, 0, 1, 1}, {1, 0, 1, 0, 0}, {0, 0, 1, 0, 1}, {0, 0, 1, 1, 1}});
        for(int rivers: sizes) System.out.println(rivers);
    }

    public static List<Integer> riverSizes(int[][] matrix) {
        // Write your code here.
        List<Integer> sizes = new ArrayList<Integer>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(visited[i][j]) continue;
                transverseNodes(i, j, matrix, visited, sizes);
            }
        }
        return sizes;
    }

    public static void transverseNodes(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> sizes){
        int currentRiverSize = 0;
        Stack<Integer[]> nodesToExplore = new Stack<Integer[]>();
        nodesToExplore.push(new Integer[] {i, j});

        while(!nodesToExplore.empty()){
            Integer[] currentNode = nodesToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
            if(visited[i][j]) continue;
            visited[i][j] = true;
            if(matrix[i][j] == 0) continue;

            currentRiverSize++;
            List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited);
            for(Integer[] neighbor: unvisitedNeighbors) nodesToExplore.add(neighbor);

        }
        if(currentRiverSize > 0) sizes.add(currentRiverSize);

    }

    public static List<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited){
        List<Integer[]> unvisitedNeighbors = new ArrayList<Integer[]>();

        if(i > 0 && !visited[i - 1][j]) unvisitedNeighbors.add(new Integer[] {i - 1, j});
        if(i < matrix.length - 1 && !visited[i + 1][j]) unvisitedNeighbors.add(new Integer[] {i + 1, j});
        if(j > 0 && !visited[i][j - 1]) unvisitedNeighbors.add(new Integer[] {i, j - 1});
        if(j < matrix[0].length - 1 && !visited[i][j + 1]) unvisitedNeighbors.add(new Integer[] {i, j + 1});
        return unvisitedNeighbors;

    }
}
