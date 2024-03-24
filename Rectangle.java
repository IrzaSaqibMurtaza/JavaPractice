
package myprojects;

public class Rectangle
{
    float length;
    float width;
    
    public Rectangle()
    {
        length=1;
        width=1;
    }
    public void setLen(float length)
    {
        if(length>0.0 && length<20.0)
        {
            this.length=length;
        }
    }
    public void setWid(float width)
    {
        if(width>0.0 && width<20.0)
        {
            this.width=width;
        }
        else
        {
            System.out.println("0-20");
        }
    }
    public float getLen()
    {
        return length;
    }
    public float getWid()
    {
        return width;
    }
    public float calcPerimeter()
    {
        return 2*(length+width);
        
    }
    public float calcArea()
    {
        return length*width;
        
    }
    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
        System.out.println("Default Length : "+r1.getLen());
        System.out.println("Default Width  : "+r1.getWid());
        r1.setLen(2.0f);
        r1.setWid(34.0f);
        System.out.println("Perimeter : "+r1.calcPerimeter());
        System.out.println("Area : "+r1.calcArea());
        
    }
}
