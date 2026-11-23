class Grid {
    private Tiles[][];
    private height;
    private width;
    private bombs_total;
    private bombs_found;

    public Grid(int d) {
        switch(d) {
            case 0:
                // easy, 9x9 with 10 bombs
                break;
            case 1:
                // medium, 16x16 with 40 bombs
                break;
            case 2:
                // hard, 30x16 with 99 bombs
                break;
            default:
                // not sure what to put here yet... maybe easy again
                break;
        }
    }
}