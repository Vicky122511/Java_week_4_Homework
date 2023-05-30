package cylinder;

public class Cylinder extends Circle{
    double height;

    Cylinder(double radius, double height){
        super(radius);

        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return this.height * this.getArea();
    }
}
