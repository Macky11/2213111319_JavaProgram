public class cylinder extends circle{

    private double height;
    
    public cylinder(double radius, double height) {
        super(null, radius);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return super.getArea() * getHeight();
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getHeight() * getRadius();
    }

    @Override
    public String toString() {
        return "height = " + getHeight() + "," + super.toString();
    }



