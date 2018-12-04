/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

/**
 *
 * @author Albert
 */
public class Box
{
    int grade, quantity;
    double depth, height, width, base, modifier;
    boolean sealableTop, canSupply;
    double[] gradePrice = {0.55, 0.65, 0.82, 0.98, 1.5};
    String errorMessage = "";
    //Default Constructor
    public Box(){}
    //Type 1 Constructor
    public Box(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
        modifier = 0;
    }
    
    //Type 2 Constructor
    public Box(double height, double width, double depth, int grade, int colour, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
        modifier = 0;
    }
    
    //Type 3, 4 and 5 Constructor
    public Box(double height, double width, double depth, int grade, int colour, boolean reinforcedBottom, boolean reinforcedCorner, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
        modifier = 0;
        
    }
    
    public double area()
    {
        //      Sides               Sides             Top and Bottom (Flaps overlap)
        return (2*(height*width) + 2*(height*depth) + 4*(width*depth));
    }
    
    public double base_price(int g)
    {
        return this.base = gradePrice[g-1];
    }
    
    public double box_price()
    {
        return (Math.floor((getQuantity() * (area() * (base + (base * modifier))))*100))/100;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public void hasSealableTop(boolean top)
    {
        if(top)modifier+=0.1;
    }
    
}
