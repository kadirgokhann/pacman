public class Ghost {
    public int _y;
    public int _x;
    public int _lastDirection;
    public Map _map;

    public Ghost(int y, int x, Map map)
    {
        _y = y;
        _x = x;
        _lastDirection = -1;
        _map = map;
    }
}
