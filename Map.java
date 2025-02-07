import java.util.ArrayList;
import java.awt.event.KeyEvent;

public class Map {
    public int[][] _map = {  
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1},       
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 2, 2, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 2, 2, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1 },
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 },    
        {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1 },   
        {1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1 },   
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1 },   
        {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1 },   
        {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1 },   
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
    };
    private PacManGame       _game   = null;
    public  ArrayList<Ghost> _ghosts = new ArrayList<>();
    private boolean[][]      _dots   = new boolean[_map.length][_map[0].length];
    private int              _dotsLeft             = 0;
    private int              _ghostMovementCounter = 0;
    
    public int              _pacmanX = 1;
    public int              _pacmanY = 1;

    public Map(PacManGame game)
    {
        _game = game;
        _ghosts.add(new Ghost(13, 13, null));
        _ghosts.add(new Ghost(13, 14, null));
        _ghosts.add(new Ghost(14, 13, null));
        _ghosts.add(new Ghost(14, 14, null));

        for (int y = 0; y < _map.length; y++) {
            for (int x = 0; x < _map[y].length; x++) {
                if (_map[y][x] == 0) {
                    _dots[y][x] = true;
                    _dotsLeft++;
                }
            }
        }
    }
    
    public void moveGhosts()
    {
        if (!(_ghostMovementCounter++ % 5 == 0))
            return;
        for (Ghost ghost : _ghosts) {
            boolean moved = false;
            boolean force = false;
            while (!moved) {
                int random = (int) (Math.random() * 4) + 1;

                if (_map[ghost._y][ghost._x + 1] != 1 && (2 != ghost._lastDirection || random == 1)
                        && (force || (ghost._x < _pacmanX))) {
                    ghost._x++;
                    ghost._lastDirection = 1;
                    moved = true;
                } else if (_map[ghost._y][ghost._x - 1] != 1 && (1 != ghost._lastDirection || random == 2)
                        && (force || ghost._x > _pacmanX)) {
                    ghost._x--;
                    ghost._lastDirection = 2;
                    moved = true;
                } else if (_map[ghost._y + 1][ghost._x] != 1 && (4 != ghost._lastDirection || random == 3)
                        && (force || ghost._y < _pacmanY)) {
                    ghost._y++;
                    ghost._lastDirection = 3;
                    moved = true;
                } else if (_map[ghost._y - 1][ghost._x] != 1 && (3 != ghost._lastDirection || random == 4)
                        && (force || ghost._y > _pacmanY)) {
                    ghost._y--;
                    ghost._lastDirection = 4;
                    moved = true;
                }
                force = true;
            }
        }
        CheckGameEnded();
        _game.Repaint();
    }

    public void movePacman(int key)
    {
        if (key == KeyEvent.VK_UP && _map[_pacmanY - 1][_pacmanX] != 1) {
            _pacmanY--;
        } else if (key == KeyEvent.VK_DOWN && _map[_pacmanY + 1][_pacmanX] != 1) {
            _pacmanY++;
        } else if (key == KeyEvent.VK_LEFT && _map[_pacmanY][_pacmanX - 1] != 1) {
            _pacmanX--;
        } else if (key == KeyEvent.VK_RIGHT && _map[_pacmanY][_pacmanX + 1] != 1) {
            _pacmanX++;
        }
        if (_dots[_pacmanY][_pacmanX]) {
            _game.ScoreAdd1();
            _dots[_pacmanY][_pacmanX] = false;
            _dotsLeft--;
        }
        CheckGameEnded();
    }

    public boolean IsThereADot(int y, int x)
    {
        return _dots[y][x];
    }

    public void CheckGameEnded()
    {
        for(Ghost ghost: _ghosts){
            if (ghost._y == _pacmanY && ghost._x == _pacmanX)
            {
                _game.GameOver();
                return;
            }
        }

        if (_dotsLeft == 0)
            _game.Won();
    }
}
