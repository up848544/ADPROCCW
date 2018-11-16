/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

import java.util.ArrayList;

/**
 *
 * @author Albert
 */
public class Order
{
    ArrayList<Box> boxes_Ordered;
    double totalPrice;
    //              height width depth grade colours top bottom corner quantity
    double[] config = {0,     0,    0,    0,    0,      0,  0,     0,     0};
    public Order()
    {
        this.boxes_Ordered = new ArrayList<>();
    }
    
    public void addBox(Box newBox)
    {
        boxes_Ordered.add(newBox);
    }
    
    public void removeBox(Box box)
    {
        boxes_Ordered.remove(box);
    }
    
    public ArrayList<Box> getBoxes()
    {
        return boxes_Ordered;
    }
    
    public double getTotalPrice()
    {
        this.totalPrice = 0;
        for(Box b : boxes_Ordered)
        {
            this.totalPrice += b.box_price() * b.getQuantity();
        }
        return this.totalPrice;
    }
    
    public void setHeight(double h)
    {
        this.config[0] = h;
    }
    public void setWidth(double w)
    {
        this.config[1] = w;
    }
    public void setDepth(double d)
    {
        this.config[2] = d;
    }
    public void setGrade(int g)
    {
        this.config[3] = g;
    }
    public void setColours(int c)
    {
        this.config[4] = c;
    }
    public void setTop(int t)
    {
        this.config[5] = t;
    }
    public void setBottom(int b)
    {
        this.config[6] = b;
    }
    public void setCorners(int c)
    {
        this.config[7] = c;
    }
    public void setQuantity(int q)
    {
        this.config[8] = q;
    }
    public boolean checkFullfillment()
    {
        boolean canBeFullfilled = true;
        for(int i = 0; i<3; i++)
        {
            if(config[i] < 0.1 || config[i] > 5)
            {
                canBeFullfilled = false;
            }
        }
        if(config[8] > 100)canBeFullfilled=false;
        return canBeFullfilled;
    }
}
