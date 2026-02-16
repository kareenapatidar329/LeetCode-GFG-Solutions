class Solution {
  
    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 'W')
            return;

        grid[i][j] = 'W';

        // explore all 8 directions (including diagonals)
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i+1, j+1);
        dfs(grid, i+1, j-1);
        dfs(grid, i-1, j+1);
        dfs(grid, i-1, j-1);
    }

    public int countIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'L') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().replaceAll(" ", "");
            grid[i] = line.toCharArray();
        }

        Solution sol = new Solution();
        System.out.println(sol.countIslands(grid));
    }
}
