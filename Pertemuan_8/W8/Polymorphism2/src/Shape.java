public abstract class Shape {
    String shapeName;

     public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    public abstract double area();


    public String toString(){
        return shapeName;
    }
}
