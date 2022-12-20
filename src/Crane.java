public class Crane {
    private final int id;
    private final double x;
    private final double y;
    private final int xmin;
    private final int ymin;
    private final int xmax;
    private final int ymax;
    private final int xspeed;
    private final int yspeed;

    public Crane(int id, double x, double y, int xmin, int ymin, int xmax, int ymax, int xspeed, int yspeed) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.xmin = xmin;
        this.ymin = ymin;
        this.xmax = xmax;
        this.ymax = ymax;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
}
