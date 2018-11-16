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
    double depth, height, width, price, base;
    boolean sealableTop;
    double[] gradePrice = {0.55, 0.65, 0.82, 0.98, 1.5};
    public Box(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
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
        return (this.height * this.width * this.depth);
    }
    
    public double base_price()
    {
        this.price = this.base = area() * gradePrice[this.grade - 1];
        return this.base;
    }
    
    public double box_price()
    {
        base_price();
        if(sealableTop)this.price += this.base*0.1;
        return this.price;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
}
