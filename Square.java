public class Square implements Shape{
    public int side=0;
    public double getArea(){
        return side*side;
    }
    public double getcircumference(){
        return 4*side;
    }
    public void setValues(int num){
        this.side=num;

    }
}