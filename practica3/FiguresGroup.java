package practica3;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


/**
 * class FiguresGroup.
 * 
 * @author LTP 
 * @version 2020-21
 */

public class FiguresGroup {
    private static final int NUM_FIGURES = 10;
    private Figure[] figuresList = new Figure[NUM_FIGURES];
    private int numF = 0;
    
    public void add(Figure f) {
        if (this.found(f) == false){
            figuresList[numF++] = f; 
        }
    }
    
    public String toString() {
        String s = "";
        for (int i = 0; i < numF; i++) {
            s += "\n" + figuresList[i];
        }
        return s;
    }

    private boolean found(Figure f) {
        for (int i = 0; i < numF; i++) {
            if (figuresList[i].equals(f)) return true;
        }
        return false;
    }

    private boolean included(FiguresGroup g) {
        for (int i = 0; i < g.numF; i++) {
            if (!found(g.figuresList[i])) return false;
        }
        return true;
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof FiguresGroup)) { return false; }
        FiguresGroup f = (FiguresGroup) o;
        return this.included(f) && f.included(this);
    }
    
    public double area() {
        double sum = 0;
        for (int i = 0; i < this.numF; i++) {
            sum = sum + figuresList[i].area(); 
        }
        return sum;
    }
    
    public Figure greatestFigure() {
        Figure f = null;
        double bigArea = 0;
        
        for (int i = 0; i < this.numF; i++) {
            if (figuresList[i].area() > bigArea ) {
                bigArea = figuresList[i].area();
                f = figuresList[i];
            }           
        }
        
        return f;
    }
    
    public List<Figure> orderedList() {
        ArrayList<Figure> list = new ArrayList();
        if (figuresList.length > 0) {
            list.add(figuresList[0]);
            for (int i=1; i<=figuresList.length-1; i++) {
                Figure x =figuresList[i];
                int j=i-1;
                while (j >= 0 && list.get(j).compareTo(x) > 0) {
                    if (j == list.size() - 1) { list.add(list.get(j)); }
                    else {
                        list.set(j + 1, list.get(j));
                        j--;
                    }
                }
                //figuresList[j+1] = x;
                list.add(x);
                
            }
        
        }
        
        return list;
    }
}