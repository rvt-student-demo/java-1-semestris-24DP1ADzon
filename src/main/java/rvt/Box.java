package rvt;

public class Box {
    private double width, height, length;

    Box(double side){
        this(side, side, side);
    }

    Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double volume(){
        return this.height * this.width * this.length;
    }

    private double faceArea(){
        return width * height;
    }

    private double topArea(){
        return length * width;
    }

    private double sideArea(){
        return length * height;
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();              
    }
 

    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public Box biggerBox(Box oldBox){
        return new Box(oldBox.getWidth()*1.25, oldBox.getHeight()*1.25, oldBox.getLength()*1.25);
    }

    public Box smallerBox(Box oldBox){
        return new Box(oldBox.getWidth()*0.75, oldBox.getHeight()*0.75, oldBox.getLength()*0.75);
    }

    public boolean nests(Box outsideBox){
        if(outsideBox.getHeight() > this.height && outsideBox.getLength() > this.length && outsideBox.getWidth() > this.width){
            return true;
        } else{
            return false;
        }
    }

}
