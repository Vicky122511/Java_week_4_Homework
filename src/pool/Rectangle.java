package pool;
/**
 * 3. Write a class with the name Main that contains the main method.
 * TEST EXAMPLE
 * → TEST CODE: Write the below code into the main method.
 * Rectangle rectangle = new Rectangle(5, 10);
 * System.out.println("rectangle.width= " + rectangle.getWidth());
 * System.out.println("rectangle.length= " + rectangle.getLength());
 * System.out.println("rectangle.area= " + rectangle.getArea());
 * Cuboid cuboid = new Cuboid(5,10,5);
 * System.out.println("cuboid.width= " + cuboid.getWidth());
 * System.out.println("cuboid.length= " + cuboid.getLength());
 * System.out.println("cuboid.area= " + cuboid.getArea());
 * System.out.println("cuboid.height= " + cuboid.getHeight());
 * System.out.println("cuboid.volume= " + cuboid.getVolume());.
 */

public class Rectangle {

    double width;
    double length;

    Rectangle(double width, double length){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }

        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;
        }

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return this.width * this.length;
    }

}