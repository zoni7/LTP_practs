package practica3;
import java.lang.Math;

/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Rectangle
{
    public Square(double x, double y, double b, double h)
    {
        super(x, y, b, h);        
    }
    
    public int compareToRange(Figure o) {
        if (Math.abs(this.area() - o.area()) <= (0.1*(this.area() + o.area()))) { 
            return 0; 
        } else {
            return this.compareTo(o);
        }
    }
}
