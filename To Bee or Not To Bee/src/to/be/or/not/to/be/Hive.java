
package to.be.or.not.to.be;

import javafx.geometry.Point3D;

/**
 * @author Henry Dench (c)
 * @author Matthew Gutkin
 * @author Eric Von Bevern
 */

public class Hive {
    private Point3D loc;
    boolean full;
    
    public Hive() {
        this(new Point3D(0,0,0));
    }
    
    public Hive(Point3D x)
    {
       setLoc(x);
    }

    public Point3D getLoc() {
        return loc;
    }

    public void setLoc(Point3D loc) {
        this.loc = loc;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }
    
    public int getX() {
        return (int)loc.getX();
    }
    
    public int getY() {
        return (int)loc.getY();
    }
    
    public int getZ() {
        return (int)loc.getZ();
    }
    
    public double getDistance(Point3D p) {
        return Math.sqrt((this.getX() - p.getX())*(this.getX() - p.getX()) + (this.getY() - p.getY())*(this.getY() - p.getY()) + (this.getZ() - p.getZ())*(this.getZ() - p.getZ()));
    }
}
