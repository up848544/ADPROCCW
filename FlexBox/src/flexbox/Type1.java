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
public class Type1 extends Box
{

    public Type1(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, sealableTop, quantity);
        super.hasSealableTop(sealableTop);
        base_price(grade);
    }        
    
    @Override
    public String printBox()
    {
        String text = "";
        text += "\n Width: " + width + "m, Height: " + height + "m, Depth: " + depth + "m, Grade: " + grade + ", Colours: 0";
            if (sealableTop)
            {
                text += ", Sealable Top ";
            }
            text += ", Quantity: " + quantity;
        return text;
    }
    
    
        
    
}
