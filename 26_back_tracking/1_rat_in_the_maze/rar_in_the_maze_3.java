//a mazw in n*n binari matrix of blocks where the upper left block
//in known asa the source block 
//and lower right most block is the sedtination block 
// if we consider the maze then maze[0][0] is the source and the maze 
//[n-1][n-1] is the destination 
// our main task is to reache the destination ffron the source 
//we have consider the rat as a character that can move either forward 
// or  back word or backword or upwords 
// in the maze matrix a few dead blocks will be denoted by 0 and active blocks will 
// be denoted by 1 , rat can move only in active maze

// rat  in the dead maze 

public class rar_in_the_maze_3 {

    private static void printPath(int sr, int sc, int er, int ec, String s, int maze[][]) {

        if (sr > er || sc > ec) {
            return;
        }

        if (maze[sr][sc] == 0) {
            return;
        }

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // go right
        printPath(sr, sc + 1, er, ec, s + "R", maze);

        // go dowm
        printPath(sr + 1, sc, er, ec, s + "D", maze);

        // // go left
        // printPath(sr, sc - 1, er, ec, s + "L", maze);

        // // go up
        // printPath(sr - 1, sc, er, ec, s + "U", maze);

    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;

        int[][] maze = {
                { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 1 }
        };

        // index are from 0 because we are treating it as a 2d arrys

        printPath(0, 0, rows - 1, cols - 1, "", maze);

    }
}
