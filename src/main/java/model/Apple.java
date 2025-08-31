package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable {
    String colour;
    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    /** Для красных яблок (colour равно "red") скидка должна быть равна 60%:
     соответствующий метод возвращает значение 60
     */
    @Override
    public double getDiscount() {
        if(colour.equals(Colour.RED)) {
            return Discount.RED;
        } else {
            return Discount.DEFAULT;
        }
    }
}
