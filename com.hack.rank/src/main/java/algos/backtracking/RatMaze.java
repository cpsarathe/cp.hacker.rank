package algos.backtracking;

/**
 * 
 * http://www.geeksforgeeks.org/backttracking-set-2-rat-in-a-maze/
 * 
 * @author CP
 *
 */
public class RatMaze {

	public static void main(String[] args) {
		int maze[][] = new int[][] { { 1, 1, 1, 0 }, { 0, 1, 0, 1 },
				{ 0, 1, 0, 1 }, { 1, 1, 1, 1 } };
		int[][] destination = new int[][] { { 3, 3 } };
		int[][] start = new int[][] { { 0, 0 } };
		RatMaze rm = new RatMaze();
		rm.solveNaiveWay(maze, destination, start);

	}

	/**
	 * 1.Assume start point of rate and endpoint of maze is given 2.Create a
	 * temp solution array with all values as 0 3.assign a starting point with
	 * value 1 as visited sol[stX][stY]=1 3.Iterate through maze - 3.1 check if
	 * its a valid move 3.1.1 check if destination reached , mark sol[i][j] = 1
	 * and break 3.1.2 if not , mark current path as valid move sol[i][j] = 1
	 * and let scanning continue; 3.2 if its a invalid move mark as sol[i][j] =
	 * 0
	 */
	public void solveNaiveWay(int[][] maze, int[][] destination, int[][] start) {
		int sol[][] = new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int count = 0;
		int stX = start[0][0];
		int stY = start[0][1];

		int endX = destination[0][0];
		int endY = destination[0][1];
		sol[stX][stY] = 1;

		int x = stX, y = stY;
		boolean isDest = false;
		

		System.out.println("Given Maze");

		for (int i = 0; i < maze.length; i++) {
			System.out.println();
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + " ");
			}
		}
		
		while (isDest == false) {
			//move right
			while (y>=0 && y < maze.length) {
				if (isValidMove(maze, x, y)) {
					if (endX == x && endY == y) {
						sol[x][y] = 1;
						isDest = true;
						break;
					} else {
						sol[x][y] = 1;
						y++;
					}
				} else {
					break;
				}
				
			}
			System.out.println("x"+x+":y:"+y);
			//move down
			y--;
			x++;
			while (x>=0 && x < maze.length) {
				if (isValidMove(maze, x, y)) {
					if (endX == x && endY == y) {
						sol[x][y] = 1;
						isDest = true;
						break;
					} else {
						sol[x][y] = 1;
						x++;
					}
				} else {
					x--;
					break;
				}
			}
			
		}
		/*
		 * for(int i=stX;i<maze.length;i++){ for(int j=stY;j<maze[0].length;j++)
		 * { count++; //check if move is valid if(isValidMove(maze,i,j)) {
		 * if(endX==i && endY==j){ sol[i][j] = 1; break; } else { sol[i][j] = 1;
		 * } } else { sol[i][j] = 0; i++; j=0; } } }
		 */

		System.out.println("\n");
		System.out.println("Result Path");
		for (int i = 0; i < sol.length; i++) {
			System.out.println();
			for (int j = 0; j < sol[0].length; j++) {
				System.out.print(sol[i][j] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Total Iterations:" + count);
	}

	public boolean moveRight(int[][] maze, int x, int y, int[][] sol, int endX,
			int endY) {
		while (y < maze.length) {
			if (isValidMove(maze, x, y)) {
				if (endX == x && endY == y) {
					sol[x][y] = 1;
					return true;
				} else {
					sol[x][y] = 1;
					y++;
				}
			}
		}
		return false;
	}

	public boolean moveDown(int[][] maze, int x, int y, int[][] sol, int endX,
			int endY) {
		while (x < maze.length) {
			if (isValidMove(maze, x, y)) {
				if (endX == x && endY == y) {
					sol[x][y] = 1;
					return true;
				} else {
					sol[x][y] = 1;
					x++;
				}
			}
		}
		return false;
	}

	public boolean isValidMove(int[][] maze, int i, int j) {
		if (i >= 0 && i < maze.length && j >= 0 && j < maze.length
				&& maze[i][j] != 0)
			return true;
		else
			return false;
	}

	public boolean isValidHorizontalMove(int[][] maze, int i, int j) {
		if (j >= 0 && j < maze.length && maze[i][j] != 0)
			return true;
		else
			return false;
	}

	public boolean isValidVerticalMove(int[][] maze, int i, int j) {
		if (i >= 0 && i < maze.length && maze[i][j] != 0)
			return true;
		else
			return false;
	}

}
