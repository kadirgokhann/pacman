import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacManGame extends JPanel implements KeyListener {
    private Timer   _timer = null;
    private Map     _map   = new Map(this);
    private MapUI   _mapUI = new MapUI(_map, this);
    private boolean _gameOver  = false;
    private boolean _won = false;
    private int     _score = 0;

    public PacManGame() {
        JFrame frame = new JFrame("PAC-MAN");
        frame.setSize(_map._map[0].length * _mapUI.TILE_SIZE, _map._map.length * _mapUI.TILE_SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);

        _timer = new Timer(25, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (! _won)
                    _map.moveGhosts();
                repaint();
            }
        });
        _timer.start();

    }

    public void Repaint()
    {
        repaint();
    }

    public void GameOver()
    {
        _gameOver = true;
    }

    public void Won()
    {
        _won = true;
    }

    public void ScoreAdd1()
    {
        _score++;
    }
    
    public int getScore()
    {
        return _score;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        _mapUI.drawMap(g);
        _mapUI.drawPacman(g);
        _mapUI.drawGhosts(g);
        _mapUI.drawScore(g);
        if (_gameOver)
            _mapUI.drawGameOver(g);
        if (_won)
            _mapUI.drawWon(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (! _won && !_gameOver)
            _map.movePacman(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new PacManGame(); 
    }
}
