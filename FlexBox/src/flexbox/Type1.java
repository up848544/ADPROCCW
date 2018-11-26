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
    public double base_price(int g)
    {
        switch (g){
            case 1:
                super.base = 0.55;
                break;
            case 2:
                super.base = 0.65;
                break;
            case 3:
                super.base = 0.82;
                break;
            default:
                super.errorMessage += "Incorrect Grade ";
                break;
        }
        return super.base;
    }
    
        
    
}
