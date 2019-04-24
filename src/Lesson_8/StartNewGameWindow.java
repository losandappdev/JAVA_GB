package Lesson_8;

import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class StartNewGameWindow extends JFrame {

    private final GameWindow gameWindow;
    private final int WIN_HEIGHT = 230;
    private final int WIN_WIDTH = 350;
    private final int MIN_WIN_LEN = 3;
    private final int MIN_FIELD_SIZE = 3;
    private final int MAX_WIN_LEN = 10 ;
    private final int MAX_FIELD_SIZE = 10;
    private final String STR_WINLEN = "Waiting length: " ;
    private final String STR_FIELD_SIZE = "Field size: " ;

    private JRadioButton jrbHumVsAi =
    private JRadioButton jrbHumVsHum =



    public StartNewGameWindow(GameWindow gameWindow){
        this.gameWindow = gameWindow;
        setSize(WIN_WIDTH, WIN_HEIGHT);

        Rectangle gameWIndowBound = gameWindow.getBounds();

        int posX = (int) (gameWIndowBound.getCenterX() - WIN_WIDTH/2);
        int posY = (int) (gameWIndowBound.getCenterY() - WIN_HEIGHT/2);

        setLocation(posX, posY);
        setTitle("New game parameters: ");

        setLayout(new GridLayout(10,1));
        add(new JLabel("Chose gaming mode"));
        gameMode.add(jrbHumVsAi);
        gameMode.add(jrbHumVsAi);
        add(jrbHumVsAi);
        add(jrbHumVsHum)
    }

    private void addGameControlsFieldWinLength

}
