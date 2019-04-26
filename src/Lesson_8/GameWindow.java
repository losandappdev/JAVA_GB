package Lesson_8;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GameWindow extends JFrame {

    private static final int WIN_HEIGHT = 555;
    private static final int WIN_WIDHT = 507;
    private static final int POS_X = 800;
    private static final int POS_Y = 300;

    private  static StartNewGameWindow startNewGameWindow;
    private static Map field;


    public GameWindow(){

        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIN_WIDHT, WIN_HEIGHT);

        JButton btnStartGame = new JButton("Start new game");
        JButton btnExit = new JButton("Exit");

        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));

        bottomPanel.add(btnStartGame);
        bottomPanel.add(btnExit);

        add(bottomPanel, BorderLayout.SOUTH);

        startNewGameWindow = new StartNewGameWindow(this);
        field = new Map();
        add(field, BorderLayout.CENTER);


        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);
            }
        });

        setResizable(false);
        setVisible(true);

    }
    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen){
        field.startNewGame(mode, fieldSizeX, fieldSizeY, winLen);

    }
}
