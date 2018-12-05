/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;


public class Type345 extends Box
{

    boolean reinforcedBottom, reinforcedCorner;
    
    /**
     * Type 3 Box constructor
     * @param height double, height of box.
     * @param width double, width of box.
     * @param depth double, depth of box.
     * @param grade int, grade of box.
     * @param colour int, the number of colours on this box.
     * @param reinforcedBottom boolean, whether the box has a reinforced bottom.
     * @param reinforcedTop boolean, whether the box has a reinforced top.
     * @param sealableTop boolean, whether the box has a sealable top.
     * @param quantity int, the quantity of boxes.
     */
    public Type345(double height, double width, double depth, int grade, int colour, boolean reinforcedBottom, boolean reinforcedCorner, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, colour, reinforcedBottom, reinforcedCorner, sealableTop, quantity);
        super.modifier += 0.15;
        super.hasSealableTop(sealableTop);
        this.reinforcedBottom = hasReinforcedBottom(reinforcedBottom);
        this.reinforcedCorner = hasReinforcedCorner(reinforcedCorner);
        base_price(grade);
    }

    /**
     * Returns a boolean for if the box has reinforced bottom.
     * @param reinforcedBottom boolean, whether the box has a reinforced bottom.
     * @return A boolean, true if the box has reinforced bottom.
     */
    public boolean hasReinforcedBottom(boolean reinforcedBottom)
    {
        if (reinforcedBottom)
        {
            super.modifier += 0.13;
        }
        return reinforcedBottom;
    }

    /**
     * Returns a boolean for if the box has reinforced corners.
     * @param reinforcedCorner boolean, whether the box has a reinforced corners.
     * @return A boolean, true if the box has reinforced corner.
     */
    public boolean hasReinforcedCorner(boolean reinforcedCorner)
    {
        if (reinforcedCorner)
        {
            super.modifier += 0.12;
        }
        return reinforcedCorner;
    }

    /**
     * Returns a string for box details.
     * @return A string providing details of the box specification.
     */
    @Override
    public String printBox()
    {
        String text = "";
        text += "\n Width: " + width + "m, Height: " + height + "m, Depth: " + depth + "m, Grade: " + grade + ", Colours: 2";
        if (sealableTop)
        {
            text += ", Sealable Top ";
        }
        if (reinforcedCorner)
        {
            text += ", Reinforced Corners ";
        }
        if (reinforcedBottom)
        {
            text += ", Reinforced Bottom ";
        }
        text += ", Quantity: " + quantity;
        return text;
    }

}
