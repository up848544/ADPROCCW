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
public class Type2 extends Box
{

    public Type2(double height, double width, double depth, int grade, int colour, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, colour, sealableTop, quantity);
        super.modifier += 0.12;
        super.hasSealableTop(sealableTop);
        base_price(grade);
    }
    
   
    
        
    
}
