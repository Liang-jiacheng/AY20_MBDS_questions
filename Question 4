# question 4
class Solution:
    #
    def __init__(self):
        self.connectivity = '4-neighbors'

    def numIslands(self, grid):
        #
        if not grid or not grid[0]:
            return
        m = len(grid)
        n = len(grid[0])
        res = 0  # record num
        for i in range(m):
            for j in range(n):
                if grid[i][j] == "1":
                    res += 1
                    self.dfs(grid, i, j, res)
        return

    def dfs(self, grid, i, j, res):
        #
        if i >= len(grid) or j >= len(grid[0]) or i < 0 or j < 0:
            return
        if grid[i][j] == "1":
            grid[i][j] = res
            self.dfs(grid, i + 1, j, res)
            self.dfs(grid, i - 1, j, res)
            self.dfs(grid, i, j + 1, res)
            self.dfs(grid, i, j - 1, res)

            if self.connectivity == '8-neighbors':
                self.dfs(grid, i + 1, j - 1, res)
                self.dfs(grid, i - 1, j - 1, res)
                self.dfs(grid, i + 1, j + 1, res)
                self.dfs(grid, i - 1, j + 1, res)


if __name__ == '__main__':
    s = Solution()
    s.connectivity = '4-neighbors'
    g = [x.strip().split('\t') for x in open('../data/input_question_4')]
    s.numIslands(g)

    f = open('../data/input_question_4_result', 'w', encoding="utf8")
    for i in g:
        output = '\t'.join([str(x) for x in i]) + '\n'
        f.write(output)
    f.close()
