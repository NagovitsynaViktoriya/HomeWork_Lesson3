package com.company;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    public abstract void open();

    public void setIconDescription(String iconDescription) {
        this.iconDescription = iconDescription;
        System.out.println(iconDescription);
    }

    public void setName(String name) {
        this.name = name;
    }
}
