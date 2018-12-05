/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flexbox;


public abstract class Box
{

    int grade, quantity;
    double depth, height, width, base, modifier;
    boolean sealableTop, canSupply;
    double[] gradePrice =
    {
        0.55, 0.65, 0.82, 0.98, 1.5
    };
    String errorMessage = "";

    //Default Constructor
    public Box()
    {
    }

    /**
     * Type 1 Box constructor
     * @param height double, height of box.
     * @param width double, width of box.
     * @param depth double, depth of box.
     * @param grade int, grade of box.
     * @param sealableTop boolean, whether the box has a sealable top.
     * @param quantity int, the quantity of boxes.
     */
    public Box(double height, double width, double depth, int grade, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
        modifier = 0;
    }

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
    public Box(double height, double width, double depth, int grade, int colour, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
        modifier = 0;
    }

    /**
     * Type 3,4,5 Box constructor
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
    public Box(double height, double width, double depth, int grade, int colour, boolean reinforcedBottom, boolean reinforcedCorner, boolean sealableTop, int quantity)
    {
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.grade = grade;
        this.sealableTop = sealableTop;
        this.quantity = quantity;
        modifier = 0;

    }

    /**
     * Returns a double representing the area of the box.
     * @return double for area of the box.
     */
    public double area()
    {
        //      Sides               Sides             Top and Bottom (Flaps overlap)
        return (2 * (height * width) + 2 * (height * depth) + 4 * (width * depth));
    }

    /**
     * sets the base price of the box based off the grade.
     * @param g the grade value of the box
     * @return a double representing the base value of the box.
     */
    public double base_price(int g)
    {
        return this.base = gradePrice[g - 1];
    }

    /**
     * calculates and returns the total price of the box.
     * @return a double representing the price of the box.
     */
    public double box_price()
    {
        return (Math.floor((getQuantity() * (area() * (base + (base * modifier)))) * 100)) / 100;
    }

    /**
     * returns the quantity of the box.
     * @return an int representing the quantity of this box.
     */
    public int getQuantity()
    {
        return this.quantity;
    }

    /**
     *  Adds the appropriate modifier cost to the box
     * @param top whether the box has a sealable top.
     */
    public void hasSealableTop(boolean top)
    {
        if (top)
        {
            modifier += 0.1;
        }
    }

    /**
     * Provides the printed details for a box.
     * @return String the details of the box.
     */
    public String printBox()
    {
        return "";
    }

}
