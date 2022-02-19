package com.company;

public class Ozone {
    public static void main(String[] args) {



        SubCategory smartphone = new SubCategory();
        smartphone.setName("Смартфоны");
        smartphone.open();

        SubCategory tv = new SubCategory();
        smartphone.setName("Телевизоры");
        smartphone.open();

        SubCategory office = new SubCategory();
        smartphone.setIconDescription("Это картинка Офисная техника");
        smartphone.setName("Офисная техника");
        smartphone.open();

        Search s1 = new Search();
        s1.getType();
        s1.click();

        ImageSlider im1 = new ImageSlider();
        im1.getType();
        im1.click();
        im1.clickRightArrow();
        im1.clickLeftArrow();
    }
}
