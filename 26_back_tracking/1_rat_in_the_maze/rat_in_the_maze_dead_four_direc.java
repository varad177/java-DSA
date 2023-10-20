
public class rat_in_the_maze_dead_four_direc {
    private static void printPath(int sr, int sc, int er, int ec, String s, int maze[][], boolean[][] isVisited) {

        if (sr < 0 || sc < 0) {
            return;
        }

        if (sr > er || sc > ec) {
            return;
        }

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if (maze[sr][sc] == 0) {
            return;
        }

        if (isVisited[sr][sc] == true) {
            return;
        }

        isVisited[sr][sr] = true;

        // go right
        printPath(sr, sc + 1, er, ec, s + "R", maze, isVisited);

        // go dowm
        printPath(sr + 1, sc, er, ec, s + "D", maze, isVisited);

        // // go left
        printPath(sr, sc - 1, er, ec, s + "L", maze, isVisited);

        // // go up
        printPath(sr - 1, sc, er, ec, s + "U", maze, isVisited);

        // back tracting
        isVisited[sr][sc] = false;

    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        boolean[][] isVisited = new boolean[rows][cols];

        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 1 }

        };

        // index are from 0 because we are treating it as a 2d arrys

        printPath(0, 0, rows - 1, cols - 1, "", maze, isVisited);

    }

}
