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
public class Type5 extends Type4
{

    public Type5(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, sealableTop, quantity);
    }
    
    @Override
    public double box_price()
    {
        super.box_price();
        super.price += super.base_price() * 0.12;
        return super.price;
    }
}
