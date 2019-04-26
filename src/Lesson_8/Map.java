package Lesson_8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Map extends JPanel {

    public static final int MODE_H_V_A = 0;
    public static final int MODE_H_V_H = 1;

    int[][] field;
    int fieldSizeX;
    int fieldSizeY;

    int winLen;

    int cellHeight;
    int cellWidth;
    boolean isInicialized = false;

    Map(){
        setBackground(Color.cyan);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    void update(MouseEvent e){
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;
        System.out.println("x: " + cellX + "y: " + cellY);
        repaint();
    }


    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLen){
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLen = winLen;
        field = new  int[fieldSizeY][fieldSizeX];
        isInicialized = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g ){
        super.paintComponent(g);
        render(g);
    }

    void render(Graphics g){
        if (!isInicialized){
            return;
        }

        int panelWindth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeX;
        cellWidth = panelWindth / fieldSizeY;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWindth,y);
        }
        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x,panelHeight);
        }
    }

}
