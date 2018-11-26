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
public class Type345 extends Box
{
    boolean reinforcedBottom, reinforcedCorner;

    public Type345(double height, double width, double depth, int grade, int colour, boolean reinforcedBottom, boolean reinforcedCorner, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, colour, reinforcedBottom, reinforcedCorner, sealableTop, quantity);
        super.modifier += 0.15;
        super.hasSealableTop(sealableTop);
        this.reinforcedBottom = hasReinforcedBottom(reinforcedBottom);
        this.reinforcedCorner = hasReinforcedCorner(reinforcedCorner);
        base_price(grade);
    }
    
    public boolean hasReinforcedBottom(boolean reinforcedBottom)
    {
        if(reinforcedBottom)super.modifier += 0.13;
        return reinforcedBottom;
    }
    public boolean hasReinforcedCorner(boolean reinforcedCorner)
    {
        if(reinforcedCorner)super.modifier += 0.12;
        return reinforcedCorner;
    }
    
    @Override
    public double base_price(int g)
    {
        switch (g){
            case 2:
                if(this.reinforcedCorner) super.errorMessage += "Incorrect Grade Cannot Have Reinforced Corners ";
                else super.base = 0.65;
                break;
            case 3:
                super.base = 0.82;
                break;
            case 4:
                super.base = 0.98;
                break;
            case 5 :
                super.base = 1.5;
                break;
            default:
                super.errorMessage += "Incorrect Grade ";
                break;
        }
        return super.base;
    }
}
