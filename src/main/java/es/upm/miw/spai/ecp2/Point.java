package es.upm.miw.spai.ecp2;

public class Point {
    
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int xy) {
        this(xy, xy);
    }

    public Point() {
        this(0, 0);
    }

    public double module() {
        return Math.sqrt(this.x * this.x + this.y + this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
    }
    
    public double distance(Point pt){    	
    	double d = Math.hypot(pt.getX()-x, pt.getY()-y);
    	return d;
    }
    
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point[" + x + "," + y + "]";
    }
    
}
