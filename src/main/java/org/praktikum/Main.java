package org.praktikum;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);//Мясо в количестве 5 кг по цене 100 рублей за кг;
        Food red = new Apple(10, 50, Colour.RED);  //Яблоки красные в количестве 10 кг по цене 50 рублей;
        Food green = new Apple(8, 60, Colour.GREEN); //Яблоки зелёные в количестве 8 кг по цене 60 рублей



    Food[] items = {meat, red, green};

    var cart = new ShoppingCart(items);
        System.out.println("общая сумма товаров в корзине без скидки " + cart.totalPrice()); // получить общую сумму товаров в корзине без скидки,
        System.out.println("общая сумма товаров в корзине со скидкой " + cart.discountPrice());// получить общую сумму товаров в корзине со скидкой,
        System.out.println("сумма всех вегетарианских продуктов в корзине без скидки " + cart.vegPrice());// получить общую сумму всех вегетарианских продуктов в корзине без скидки.


    }
}