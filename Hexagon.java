public class Hexagon implements Shape{
    public int side=0;
    public double getArea(){
        return ((3*1.73)/2)*(side*side);
    }
    public double getcircumference(){
        return 6*side;
    }
    public void setSides(int a){
        this.side=a;
    }
}