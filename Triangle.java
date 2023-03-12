public class Triangle implements Shape{
    public int side1=0;
    public int side2=0;
    public int side3=0;
    public double getArea(){
        return (side1*side2)/2;
    }
    public double getcircumference(){
        return (side1+side2+side3);
    }
    public void setValues(int a,int b,int c){
        this.side1=a;
        this.side2=b;
        this.side3=c;
    }
}