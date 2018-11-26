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
    double[] config =
    {
        0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    public Order()
    {
        this.boxes_Ordered = new ArrayList<>();
    }

    public boolean canSupply(double h, double w, double d, int g, int col, boolean t, boolean b, boolean c, int q)
    {
        if (g <= 3 && col == 0 && !b && !c)
        {
            return true;
        }
        else if (g >= 2 && g <= 4 && col == 1 && !b && !c)
        {
            return true;
        }
        else if (g >= 2 && col == 2 && !b && !c)
        {
            return true;
        }
        else if (g >= 2 && col == 2 && b && !c)
        {
            return true;
        }
        else if (g >= 3 && col == 2 && b && c)
        {
            return true;
        }
        else{return false;}
    }

    public Box addBox(double h, double w, double d, int g, int col, boolean t, boolean b, boolean c, int q)
    {
        if (g <= 3 && col == 0 && !b && !c)
        {
            boxes_Ordered.add(new Type1(h,w,d,g,t,q)); 
        }
        if (g >= 2 && g <= 4 && col == 1 && !b && !c)
        {
            boxes_Ordered.add(new Type2(h,w,d,g,col,t,q));
        }
        if (g >= 2 && col == 2 && !b & !c)
        {
            boxes_Ordered.add(new Type345(h,w,d,g,col,t,b,c,q));
        }
        if (g >= 2 && col == 2 && b && !c)
        {
            boxes_Ordered.add(new Type345(h,w,d,g,col,t,b,c,q));
        }
        if (g >= 3 && col == 2 & b & c)
        {
            boxes_Ordered.add(new Type345(h,w,d,g,col,t,b,c,q));
        }
        return boxes_Ordered.get(boxes_Ordered.size()-1);
    }
    
    public double totalPrice()
    {
        this.totalPrice = 0;
        for(Box b : boxes_Ordered)
        {
            totalPrice += b.box_price();
        }
        return totalPrice;
    }
}
