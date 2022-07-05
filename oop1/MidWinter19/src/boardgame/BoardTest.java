package boardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test
    public void sampleTest(){
        Board board = new Board(2, 3);
        board.setCellValue(1, 2, 10);
        assertEquals(10, board.getCellValue(1, 2));
    }
}
