package com.company;

public class Search implements Element {
    @Override
    public String getType() {
        return "Поиск";
    }

    @Override
    public void click() {
        System.out.println("Что-то ищем");
    }
}
