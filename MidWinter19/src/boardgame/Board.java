package boardgame;

public class Board {
    private int cells[][];

    public Board(int xSize, int ySize) {
        cells = new int[xSize][ySize];
    }

    public void setCellValue(int x, int y, int value) {
        cells[x][y] = value;
    }

    public int getCellValue(int x, int y) {
        return cells[x][y];
    }
}

