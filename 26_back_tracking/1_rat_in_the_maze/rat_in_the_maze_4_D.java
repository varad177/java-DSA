
//rat in the maze for 4 direction 

public class rat_in_the_maze_4_D {

    private static void printPath(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {

    
        if (sr > er || sc > ec) {
            return;
        }

        if (sc < 0 || sr < 0) {
            return;
        } // v imp

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if(isVisited[sr][sc] == true){
            return;
        }

        isVisited[sr][sc] = true;

        // go dowm
        printPath(sr + 1, sc, er, ec, s + "D", isVisited);

        // go right
        printPath(sr, sc + 1, er, ec, s + "R", isVisited);

        // go left
        printPath(sr, sc - 1, er, ec, s + "L", isVisited);

        // go up
        printPath(sr - 1, sc, er, ec, s + "U", isVisited);

        // backtracking
        isVisited[sr][sc] = false;

    }

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        boolean[][] isVisited = new boolean[rows][cols];

        // index are from 0 because we are treating it as a 2d arrys

        printPath(0, 0, rows - 1, cols - 1, "", isVisited);

    }

}
