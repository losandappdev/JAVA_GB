package Lesson_8;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StartNewGameWindow extends JFrame {

    private final GameWindow gameWindow;

    private final int WIN_HEIGHT = 230;
    private final int WIN_WIDTH = 350;
    private final int MIN_WIN_LEN = 3;
    private final int MIN_FIELD_SIZE = 3;
    private final int MAX_WIN_LEN = 10 ;
    private final int MAX_FIELD_SIZE = 10;
    private final String STR_WIN_LEN = "Winning lenght: " ;
    private final String STR_FIELD_SIZE = "Field size: " ;

    private JRadioButton jrbHumVsAi = new  JRadioButton("Human vs Ai", true);
    private JRadioButton jrbHumVsHum = new  JRadioButton("Human vs Human");
    private ButtonGroup gameMode = new ButtonGroup();

    private JSlider slFieldSize;
    private JSlider slWinLength;

    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;

        setSize(WIN_WIDTH, WIN_HEIGHT);

        Rectangle gameWindowBounds = gameWindow.getBounds();

        int posX = (int) (gameWindowBounds.getCenterX() - WIN_WIDTH/2);
        int posY = (int) (gameWindowBounds.getCenterY() - WIN_HEIGHT/2);

        setLocation(posX, posY);
        setTitle("New game parameters: ");

        setLayout(new GridLayout(10, 1));
        addGameControlsMode();
        addGameControlsFieldWinLength();

        JButton btnStartGame = new JButton("START!");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartGameClick();
            }
        });
        add(btnStartGame);
    }

    void btnStartGameClick(){
        int gameMode;
        if (jrbHumVsAi.isSelected()){
            gameMode = Map.MODE_H_V_A;
        }else gameMode = Map.MODE_H_V_H;

        int fieldSize = slFieldSize.getValue();
        int winLen = slWinLength.getValue();
        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLen);
        setVisible(false);
    }

    void addGameControlsMode(){
        add(new JLabel("Choose gaming mode"));
        gameMode.add(jrbHumVsAi);
        gameMode.add(jrbHumVsHum);
        add(jrbHumVsAi);
        add(jrbHumVsHum);
    }

  private void addGameControlsFieldWinLength(){
        add(new JLabel("Choose field size: "));
        final JLabel lbFieldSize = new JLabel(STR_FIELD_SIZE + MIN_FIELD_SIZE);
        add(lbFieldSize);

        slFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int curentFieldSize = slFieldSize.getValue();
                lbFieldSize.setText(STR_FIELD_SIZE + curentFieldSize);
                slWinLength.setMaximum(curentFieldSize);
            }
        });

        add(slFieldSize);

        add(new JLabel("Choose winning length: "));
        final JLabel lbWinLen = new JLabel(STR_WIN_LEN + MIN_WIN_LEN);
        add(lbWinLen);

        slWinLength = new JSlider(MIN_WIN_LEN, MAX_WIN_LEN, MIN_WIN_LEN);
        slWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLen.setText(STR_WIN_LEN + slWinLength.getValue());
            }
        });
        add(slWinLength);
  }

}
