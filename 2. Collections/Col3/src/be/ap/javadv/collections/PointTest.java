package be.ap.javadv.collections;

import java.util.ArrayList;
import java.util.Random;

public class PointTest {
    public Random generator = new Random();
    private ArrayList<Point> points = new ArrayList<>();

    public void pointTester(int aantal){
        Random xgenerator = new Random();
        Random ygenerator = new Random();
        Random zgenerator = new Random();
        for (int i = 0; i < 10000; i++) {
            points.add(new Point(xgenerator.nextFloat()*9.5f,ygenerator.nextFloat()*9.5f,zgenerator.nextFloat()*9.5f));
        }
        System.out.println(points.size() + " punten gegenereerd.");
        System.out.println();
        for (int i = 0; i < aantal; i++) {
            double distance = this.getDistance(this.getRandomPoint(),this.getRandomPoint());
            System.out.println("Afstand " + i + ":\t" + distance);
        }
    }
    private Point getRandomPoint(){
        return points.get(generator.nextInt(points.size()));
    }

    private double getDistance(Point pointA, Point pointB){
        int deltaX = pointA.hashCode()/100 - pointB.hashCode()/100;
        int deltaY = (pointA.hashCode()/10)%10 - (pointB.hashCode()/10)%10;
        int deltaZ = pointA.hashCode()%10 - pointB.hashCode()%10;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2) + Math.pow(deltaZ, 2));
    }
    
}