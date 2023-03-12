public class Rectangle implements Shape{
    public int length=0;
    public int width=0;
    public double getArea(){
        return length*width;
    }
    public double getcircumference(){
        return (2*length)+(2*width);
    }
    public void setValues(int len,int wid){
        this.length=len;
        this.width=wid;
    }

}