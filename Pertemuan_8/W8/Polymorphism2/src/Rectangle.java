import java.awt.datatransfer.StringSelection;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width){
        super("Rectangle");
        this.length =length;
        this.width = width;
    }

    @Override
    public double area(){
        return length *width;
    }

    @Override
    public String toString(){
        return super.toString() + " with length " + length + " and width " +width;
    }
}
