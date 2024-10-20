public class Cylinder extends Shape{
    double radius;
    double heigth;

    public Cylinder(double radius, double heigth){
        super("Cylinder");
        this.radius =radius;
        this.heigth = heigth;
    }

    @Override
    public double area(){
        return Math.PI * (radius * radius) *heigth;
    }

    @Override
    public String toString(){
        return super.toString() + " with radius " + radius + " and height " + heigth + " area " + area();
    }
}
