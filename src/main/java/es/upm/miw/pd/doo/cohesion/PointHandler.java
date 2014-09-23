package es.upm.miw.pd.doo.cohesion;

import java.util.ArrayList;
import java.util.List;

public class PointHandler {

    private List<Point> collection;

    public PointHandler() {
        this.collection = new ArrayList<>();
    }

    public void add(Point point) {
        this.collection.add(point);
    }

    public int size() {
        return this.collection.size();
    }

    public double totalModule() {
        double result = 0;
        for (Point point : collection) {
            result += point.module();
        }
        return result;
    }
    
    public double totalPhase(){
        double result = 0;
        for (Point point : collection) {
            result += point.module();
        }
        return result;        
    }
}
