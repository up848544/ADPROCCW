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
    boolean sealableTop;
    double[] gradePrice = {0.55, 0.65, 0.82, 0.98, 1.5};
    
    //Type 1
    public Box(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
    }
    
    //Type 2
    public Box(double height, double width, double depth, int grade, int colour, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
    }
    
    //Type 3, 4 and 5
    public Box(double height, double width, double depth, int grade, int colour, boolean reinforcedBottom, boolean reinforcedCorner, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
    }
    
    public double area()
    {
        return (2*(height*width) + 2*(height*depth) + 4*(width*depth));
    }
    
    public double base_price(int g)
    {
        return this.base = gradePrice[g-1];
    }
    
    public double box_price()
    {
        return (getQuantity() * area() * (base_price(grade) * modifier));
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
