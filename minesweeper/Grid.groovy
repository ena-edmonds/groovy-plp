class Grid {
    private tiles;
    private height;
    private width;
    private bombs_total;
    private bombs_found;

    public Grid(int d) {
        switch(d) {
            case 0:
                this.bombs_total = 10;
                tiles = new Tile[9][9];
                // easy, 9x9 with 10 bombs
                break;
            case 1:
                this.bombs_total = 40;
                tiles = new Tile[16][16];
                // medium, 16x16 with 40 bombs
                break;
            case 2:
                this.bombs_total = 99;
                tiles = new Tile[30][16];
                // hard, 30x16 with 99 bombs
                break;
            default:
                this.bombs_total = 10;
                tiles = new Tile[9][9];
                // not sure what to put here yet... maybe easy again
                break;
        }
    }
}