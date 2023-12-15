import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
public class Player extends Cell implements KeyboardHandler {

    private int speed =0;
    int columns;
    int rows;
    int PADDING = 10;
    int cellSize = 20;
    Rectangle player;
    protected GridDirection currentDirection;



    public Player(int columns, int rows) {
        super();
        this.columns = columns;
        this.rows = rows;
        init();
    }
    public void createPlayer(){
        player = new Rectangle(PADDING,PADDING,cellSize,cellSize);
        player.draw();
        player.setColor(Color.RED);
        player.fill();


    }
    public void init() {
       Keyboard keyboard = new Keyboard(this);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent painted = new KeyboardEvent();
        painted.setKey(KeyboardEvent.KEY_SPACE);
        painted.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent notPainted = new KeyboardEvent();
        notPainted.setKey(KeyboardEvent.KEY_SPACE);
        notPainted.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        System.out.println("11");
        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(painted);
        keyboard.addEventListener(notPainted);

    }
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
              player.translate(-cellSize,0);
                break;
            case KeyboardEvent.KEY_RIGHT:
                player.translate(cellSize,0);
                break;
            case KeyboardEvent.KEY_UP:
                player.translate(0,-cellSize);
                break;
            case KeyboardEvent.KEY_DOWN:
                player.translate(0,cellSize);
                break;
        }



    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            speed = 0;
        }
    }
    /*public boolean isHittingWall() {

        switch (currentDirection) {
            case LEFT:
                if (getPos().getCol() == 0) {
                    return true;
                }
                break;
            case RIGHT:
                if (getPos().getCol() == grid.getCols() - 1) {
                    return true;
                }
                break;
            case UP:
                if (getPos().getRow() == 0) {
                    return true;
                }
                break;
            case DOWN:
                if (getPos().getRow() == grid.getRows() - 1) {
                    return true;
                }
        }

        return false;

     */
}
