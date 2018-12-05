/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;

public class Type2 extends Box
{

    /**
     * Type 2 Box constructor
     * @param height double, height of box.
     * @param width double, width of box.
     * @param depth double, depth of box.
     * @param grade int, grade of box.
     * @param colour int, the number of colours on this box.
     * @param sealableTop boolean, whether the box has a sealable top.
     * @param quantity int, the quantity of boxes.
     */
    public Type2(double height, double width, double depth, int grade, int colour, boolean sealableTop, int quantity)
    {
        super(height, width, depth, grade, colour, sealableTop, quantity);
        super.modifier += 0.12;
        super.hasSealableTop(sealableTop);
        base_price(grade);
    }

    /**
     * Returns a string for box details.
     * @return A string providing details of the box specification.
     */
    @Override
    public String printBox()
    {
        String text = "";
        text += "\n Width: " + width + "m, Height: " + height + "m, Depth: " + depth + "m, Grade: " + grade + ", Colours: 1";
        if (sealableTop)
        {
            text += ", Sealable Top ";
        }

        text += ", Quantity: " + quantity;
        return text;
    }

}
