import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;
public class Grid {

    int width;
    int height;
    int columns;
    int rows;
    int PADDING = 10;
    private int cellSize = 20;
    Rectangle grid;
    Rectangle[][] rectangles;
    Picture background;
    public Grid(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

    }

    public void init() {
        //grid = new Rectangle(PADDING,PADDING,width,height);
        //grid.draw();
        //grid.setColor(Color.BLACK);

        //rectangles = new Rectangle[30][30];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {

                Rectangle rect = new Rectangle(PADDING + (cellSize * i), PADDING + (cellSize * j), this.cellSize, this.cellSize);
                rect.draw();
                rect.setColor(Color.BLACK);
            }
        }
    }


}
