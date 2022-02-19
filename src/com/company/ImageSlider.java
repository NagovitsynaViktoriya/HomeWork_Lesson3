package com.company;

public class ImageSlider implements Element {
    @Override
    public String getType() {
        return "Слайдер изображений";
    }

    @Override
    public void click() {
        System.out.println("Переходим на рекламируемый товар");
    }

    public void clickRightArrow () {
        System.out.println("Смотрим следующую картинку");
    }

    public void clickLeftArrow () {
        System.out.println("Смотрим предыдущую картинку");
    }
}
