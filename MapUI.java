import java.util.ArrayList;
import java.awt.*;

public class MapUI {
    public static final int TILE_SIZE  = 15;
    private Map         _map;
    private PacManGame  _game;
    private int         _lastGhostColorBlack = 0;
    private boolean     _iSwearTheLastColorWasBlack = false;
    private boolean     _lastWonColor = false;  

    public MapUI(Map map, PacManGame game)
    {
        _map = map;
        _game = game;
    }

    public void drawGameOver(Graphics g)
    {
        g.setColor(Color.RED);
        Font customFont = new Font("Arial", Font.BOLD, 42);
        g.setFont(customFont);

        FontMetrics metrics = g.getFontMetrics(customFont);
        int textWidth       = metrics.stringWidth("GAME OVER");
        int textHeight = metrics.getHeight();

        // Coordinates and dimensions for the background
        int x = 100;
        int y = 210 - textHeight;
        int padding = 10;

        // Draw the background rectangle
        g.setColor(Color.WHITE); // Background color
        g.fillRect(x - padding, y - padding, textWidth + 2 * padding, textHeight + 2 * padding);

        // Draw the text
        g.setColor(Color.RED); // Text color
        g.drawString("GAME OVER", x, 200);
    }
        
    public void drawWon(Graphics g)
    {
        if (_lastWonColor)
            _lastWonColor = false;
        else
            _lastWonColor = true;

        Font customFont = new Font("Arial", Font.BOLD, 30);
        g.setFont(customFont);

        FontMetrics metrics = g.getFontMetrics(customFont);
        int textWidth = metrics.stringWidth("CONGS! YOU WON");
        int textHeight = metrics.getHeight();

        // Coordinates and dimensions for the background
        int x = 80;
        int y = 210 - textHeight;
        int padding = 10;

        // Draw the background rectangle
        g.setColor(Color.WHITE); // Background color
        g.fillRect(x - padding, y - padding, textWidth + 2 * padding, textHeight + 2 * padding);

        if (_lastWonColor)
            g.setColor(Color.RED);
        else
            g.setColor(Color.YELLOW);
        g.drawString("CONGS! YOU WON", x, 200);
    }

    public void drawScore(Graphics g)
    {
        g.setColor(Color.WHITE);
        g.drawString("Puan: " + _game.getScore(), 10, 10);
    }
    public void drawPacman(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(_map._pacmanX * TILE_SIZE, _map._pacmanY * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }

    public void drawGhosts(Graphics g)
    {
        if (_lastGhostColorBlack == 5 && _iSwearTheLastColorWasBlack)
            _lastGhostColorBlack = 10;

        ArrayList<Color> colors = new ArrayList<>();

        colors.add(Color.RED);
        colors.add(Color.CYAN);
        colors.add(Color.GREEN);
        colors.add(Color.ORANGE);
        boolean black = false;
        for (int i = 0; i < _map._ghosts.size(); i++) {
            Ghost ghost = _map._ghosts.get(i);
            if (_lastGhostColorBlack < 5) {
                black = true;
                g.setColor(Color.BLACK);

            } else {
                g.setColor(colors.get(i));

            }

            g.fillOval(ghost._x * TILE_SIZE, ghost._y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }
        if (black) {
            _lastGhostColorBlack++;
            _iSwearTheLastColorWasBlack = true;
        } else {
            _lastGhostColorBlack--;
            _iSwearTheLastColorWasBlack = false;
        }
    }
    public void drawMap(Graphics g)
    {
        for (int y = 0; y < _map._map.length; y++) {
            for (int x = 0; x < _map._map[y].length; x++) {
                if (_map._map[y][x] == 0) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                } else if (_map._map[y][x] == 1) {
                    g.setColor(Color.BLUE);
                    g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                } else if (_map._map[y][x] == 2) {
                    g.setColor(Color.GRAY);
                    g.fillRect(x * TILE_SIZE, y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                }
                if (_map.IsThereADot(y, x)) {
                    g.setColor(Color.WHITE);
                    g.fillOval(x * TILE_SIZE + TILE_SIZE / 4, y * TILE_SIZE + TILE_SIZE / 4, TILE_SIZE / 2,
                            TILE_SIZE / 2);
                }
            }
        }
    }
}
