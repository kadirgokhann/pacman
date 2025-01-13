import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PacManGame extends JPanel implements KeyListener {

    private static final    int TILE_SIZE   = 20; 
    private                 int pacmanX     = 1; 
    private                 int pacmanY     = 1;

    private int[][] map = { 
        {1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 1, 0, 1},
        {1, 1, 1, 0, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1}
    };

    public PacManGame() {
        JFrame frame = new JFrame("PAC-MAN");
        frame.setSize(map[0].length * TILE_SIZE, map.length * TILE_SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == 1) {
                    g.setColor(Color.BLUE);
                    g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                } else {
                    g.setColor(Color.BLACK);
                    g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                }
            }
        }
        
        g.setColor(Color.YELLOW);
        g.fillOval(pacmanX * TILE_SIZE, pacmanY * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP && map[pacmanY - 1][pacmanX] != 1) {
            pacmanY--;
        } else if (key == KeyEvent.VK_DOWN && map[pacmanY + 1][pacmanX] != 1) {
            pacmanY++;
        } else if (key == KeyEvent.VK_LEFT && map[pacmanY][pacmanX - 1] != 1) {
            pacmanX--;
        } else if (key == KeyEvent.VK_RIGHT && map[pacmanY][pacmanX + 1] != 1) {
            pacmanX++;
        }
        repaint(); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    public static void main(String[] args) {
        new PacManGame(); 
    }
}
