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
public class Type3 extends Type2
{

    public Type3(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, sealableTop, quantity);
    }
       
    @Override
    public double box_price()
    {
        super.box_price();
        super.price += super.base_price() * 0.03;
        return super.price;
    }
}
