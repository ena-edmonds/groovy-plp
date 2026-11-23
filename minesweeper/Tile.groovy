class Tile {
    private bomb;
    private visible;
    private flagged;
    private bombs_near;
    private x;
    private y;

    public Tile(boolean b, int x, int y) {
        this.bomb = b;
        this.visible = false;
        this.flagged = false;
        this.bombs_near = 0;
        this.x = x;
        this.y = y;
    }

    // getters
    def isBomb() { bomb; }
    def isVisible() { visible; }
    def isFlagged() { flagged; }
    def getBombsNear() { bombs_near; }
    def getCoordinates() { return [x, y]; }

    // setters
    def setVisible(boolean v) { visible = v; }
    def setFlagged(boolean f) { flagged = f; }
    def setBombsNear(int n) { bombs_near = n; }

    // toString
    def toString() {
        if(visible) return "[" + getBombsNear() + "]";
        return "[ ]";
    }
}