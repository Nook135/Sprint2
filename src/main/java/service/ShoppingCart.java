package service;

import model.Food;

public class ShoppingCart {
    private final Food [] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    // получить общую сумму товаров в корзине без скидки,
    public double totalPrice() {
        double sum = 0;
        for (Food item : items) {
            sum += item.getPrice() * item.getAmount();
            
        }
        return sum;
    }

    // получить общую сумму товаров в корзине со скидкой,
    public double discountPrice() {
        double sum = 0;
        for (Food item : items) {
            double discount = (100 - item.getDiscount()) / 100;
            sum += item.getPrice() * item.getAmount() * discount;

        }
        return sum;
    }
    // получить общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double vegPrice() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getPrice() * item.getAmount();
            }
        }
        return sum;
    }



}
